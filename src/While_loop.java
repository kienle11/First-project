import java.util.Random;
import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so");
        int n = scanner.nextInt();
        /* while (n<1 || n>99){
             System.out.println("Nhap lai n");
             n = scanner.nextInt();
         }
        System.out.println("da xong");*/
        Random random = new Random();
        int a = random.nextInt(10)+1;
        while (n>a || n<a){
            if (n<a){
                System.out.println("ban doan nho hon r");
                n= scanner.nextInt();}
            else{
                System.out.println("ban doan lon hon r");
                n= scanner.nextInt();
            }

    }
        System.out.println("ban doan trung r");

}
}