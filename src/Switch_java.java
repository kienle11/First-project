import java.util.Scanner;

public class Switch_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  System.out.println("Nhap so lieu");
        int a = Integer.parseInt(scanner.nextLine());
        int div = a%2;
        switch (div){
            case 0:
                System.out.println("So chan");
                break;
            default:
                System.out.println("So le");
                break;
        }*/

       /* System.out.println("Moi bam so de chon");
        System.out.println("1 de tim theo ten");
        System.out.println("2 de tim theo tac gia");
        System.out.println("3 de tim theo nha xuat ban");
        System.out.println("4 tim theo tieu de");
        int x= scanner.nextInt();
        switch (x){
            case 1:
                System.out.println("Tim theo ten");
                break;
            case 2 :
                System.out.println("Tim theo tac gia");
                break;
            case 3:
                System.out.println("Tim theo nha xuat ban");
                break;
            case 4:
                System.out.println("Tim theo tieu de");
                break;
            default:
                System.out.println("Phim bam ko hop le");
                break;
        }*/

        System.out.println("Enter a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter calculation:");
        String calculation = scanner.nextLine();
        double result = 0;

        switch (calculation){
            case "+":
                result= a+b;
                System.out.println(result);
break;
            case "/":
                result= a/b;
                System.out.println(result);
                break;
            case "%":
                result=a%b;
                System.out.println(result);
                break;
            case "-":
                result=a-b;
                System.out.println(result);
                break;
            default:
                System.out.println("Result"+result);
        break;}

    }
}
