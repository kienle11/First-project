import java.util.Random;
import java.util.Scanner;

public class if_else{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Moi ban nhap chieu cao (m):");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Moi ban nhap can nang (kg):");
        double weight = Double.parseDouble(scanner.nextLine());
        double bmi = weight / (height*height);
        System.out.println("Chi so BMI cua ba la:"+bmi);
        if (bmi<15){
            System.out.println("Than hinh qua gay");
        }
        else if (bmi>=15 && bmi<16) {
            System.out.println("Than hinh gay");
        }
        else if (bmi>=16 && bmi<18.5) {
            System.out.println("Than hinh hoi gay");
        }
        else if (bmi>=18.5 && bmi<25) {
            System.out.println("Than hinh nong bong");
        }
        else if (bmi>=25 && bmi<30) {
            System.out.println("Than hinh hoi beo");
        }*/
        /*double a = 1;
        double b = 2;
        double c = -3;
        double delta = b*b- 4*a*c;
        System.out.println(delta);
        if (delta<0){
            System.out.println("PT vo nghiem");
        }
        else if (delta==0) {
double x = -b/(2*a);
            System.out.println("PT co nghiem kep X1 = X2 = "+x);
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 =  (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Pt co 2 nghiem x1 = "+x1+" va x2="+x2);
        }*/

        /*System.out.println("Moi ban nhap so nguyen: ");
int n = Integer.parseInt(scanner.nextLine());
String answer = ( n%2==0)? "Chan" : "le";
        System.out.println("so nhap la: "+answer);*/

       /* System.out.println("Nhap diem TB:");
        double n = Double.parseDouble(scanner.nextLine());
        String answer = (n>=8)? "Gioi":
                ((n<8 && n>=6.5)?"Kha":
                        (n<6.5 && n>5)?"Trung binh":"Yeu");
        System.out.println("Ban dat hoc sinh "+answer);*/
// ax^2+bx+c=0
       /* System.out.println("Enter a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        if (a == 0) {
            double x = -c / b;
            System.out.println("PT co nghiem x= " + x);
        }
        else { double delta = Math.pow(b,2) - 4*a*c;
            if (delta<0){
                System.out.println("PT vo nghiem");
            }
            else if (delta==0) {double x = -b/a;

                System.out.println("PT co nghiem x= "+x);
            }
else {
    double x1= (-b-Math.sqrt(delta))/(2*a);
    double x2= (-b+ Math.sqrt(delta))/(2*a);
                System.out.println("PT co 2 nghiem X1= "+x1+" X2= "+x2);
            }
        }*/

        System.out.println("User name:");
    String name = scanner.nextLine();
        System.out.println("Password:");
    String passwordInput = scanner.nextLine();
    String username = "techmaster";
    String password = "hoclacoviec";
    if (name!=username || password!=passwordInput){
        System.out.println("Tai khoan ko ton tai, vui long thu lai");
    } else {
        System.out.println("Dang nhap thanh cong");
    }
    }
}
