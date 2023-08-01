import java.util.Scanner;

public class For_java {
    public static void main(String[] args) {
       /* for (int i = 2; i<12; i+=2) {
            System.out.println("i= " + i);
        }*/

       /* for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n%5== 0) {
                System.out.println("n= fizzBuzz");
            }
            else if (n % 5 == 0) {
                System.out.println("n= buzz");
            }
            else if (n%3 ==0 ) {
                System.out.println("n= fizz");
            }
            else {
                System.out.println("n= "+n);
            }
        }*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi nhap so");
        int n = Integer.parseInt(scanner.nextLine());
       int sum=0 ;
       /* int multi = 1;
        for (int i =1; i<=n; i++){
           sum+=i;
            System.out.println(sum);
            int sum=0 ;
                multi*=i;
                System.out.println(multi);
        }*/

            for (int i =0; i<=n; i++){
            if (i%2==0){
                sum+=i;
                System.out.println(sum);
            }
                else{
                System.out.println("khong ton tai so chan");
            }
        }

    }
}
