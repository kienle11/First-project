package Manage_Hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten benh nhan");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi benh nhan");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap benh an");
        String note = scanner.nextLine();
        System.out.println("Nhap ngay nhap vien");
        String datePatient = scanner.nextLine();
        LocalDate dayMovein = LocalDate.parse(datePatient, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Patient patient = new Patient(name,age,note,dayMovein);

        //Doctor
        System.out.println("Nhap ten bac sy");
        String nameDoctor = scanner.nextLine();
        System.out.println("Nhap tuoi bac sy");
        int ageDoctor = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap chuyen nghanh");
        String specialize = scanner.nextLine();
        System.out.println("Nhap so gio lam viec");
        double workOur = Double.parseDouble(scanner.nextLine());
        Doctor doctor = new Doctor(name,age,specialize,workOur);

        ManageHospital manageHospital = new ManageHospital(patient,doctor);
        System.out.println(manageHospital);

    }
}
