package com.example.demo.controller;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PersonController {

    @Autowired
    private PersonService PersonService;
    @Autowired
    private PersonDAO personDAO;

     //GET: http://localhost:8080/books
    @GetMapping("/persons")
    public List<Person> getPersonList() {
        return PersonService.getAllPerson();
    }
@GetMapping("/groupPeopleByCity")
    public String groupPeopleByCity(Model model){
        model.addAttribute("grCity",personDAO.groupByCity());
        return "groupPeopleByCity";
}
    @GetMapping("/persons/groupJobByCount")
    public String groupJobByCount(Model model){
        model.addAttribute("grJob",personDAO.countJobOccupation());
        return "groupJobByCount";
    }
    @GetMapping("/aboveAverageSalary")
    public String aboveAverageSalary(Model model){
        model.addAttribute("avgSalary",personDAO.listPeopleAboveAverageSalary());
        return "aboveAverageSalary";
    }
    @GetMapping("/longestName")
    public String longestName(Model model){
        model.addAttribute("longestName",personDAO.getPersonWithLongestName());
        return "longestName";
    }
    @GetMapping("/links")
    public String links(){
        return "links";
    }
}

