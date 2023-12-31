package com.example.demo.dao;

import com.example.demo.PersonRepository;
import com.example.demo.database.PersonDB;
import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PersonDAO implements PersonRepository {
    private List<Person> personList;
    private Person person;
   public static List<Person> findAll(){
        return PersonDB.personList;
    }
    public static Person findById(int id){
        for (Person person : PersonDB.personList ){
            if (person.getId()==id) return person;
        }
        return null;
    }
    @Override
    public List<Person> inSalaryRange(int start, int end) {
        return personList.stream()
                .filter(person -> person.getSalary() >= start && person.getSalary() <= end)
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> startsWith(String prefix) {
        return personList.stream()
                .filter(person -> person.getFullname().startsWith(prefix))
                .collect(Collectors.toList());
    }
    @Override
    public List<Person> sortByBirthYearDescending() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::getBirthday).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> top5HighestPaid() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> inAgeRange(int start, int end) {
       /* int currentYear = java.time.LocalDate.now().getYear();
        int startYear = currentYear - end;
        int endYear = currentYear - start;
        return personList.stream()
                .filter(person -> person.getBirthday() >= startYear && person.getBirthday() <= endYear)
                .collect(Collectors.toList());*/ return null;
    }
    public List<String> groupByCity () {
        return personList.stream()
                .map(Person::getCity)
                .distinct()
                .collect(Collectors.toList());
    }
    public Map<String, Long> countJobOccupation() {
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getJob, Collectors.counting()));
    }
    public List<Person> listPeopleAboveAverageSalary() {
        double averageSalary = personList.stream()
                .mapToDouble(Person::getSalary)
                .average()
                .orElse(0);
        return personList.stream()
                .filter(person -> person.getSalary() > averageSalary)
                .collect(Collectors.toList());
    }
    public Optional<Person> getPersonWithLongestName() {
        return personList.stream()
                .max(Comparator.comparingInt(person -> person.getFullname().length()));
    }

}
