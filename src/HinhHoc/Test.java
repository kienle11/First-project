package HinhHoc;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh hinh chu nhat");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chieu rong hinh chu nhat");
        double width = Double.parseDouble(scanner.nextLine());
        Retangle retangle = new Retangle(length,width);
        retangle.infor();
    }
}
