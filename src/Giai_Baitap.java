import java.util.Scanner;

public class Giai_Baitap {
    public static void main(String[] args) {
       /* Ex1: Viết chương trình nhập vào số nguyên n, in ra kết quả số n.
       Dùng vòng lặp For , vòng lặp While
        */
       Scanner scanner= new Scanner(System.in);
       /* System.out.println("Enter n");
    int n = Integer.parseInt(scanner.nextLine());
    int multi = 1;
   for (int i = 1; i<=n; i++){
multi*=i;
    }
        System.out.println("Giai thua cua n:"+multi);

    while (n>0){
        multi*=n;
        n--;
    }
        System.out.println( n+"!= "+multi);*/

        /* Ex2: Viết chương trình nhập số a từ bàn phím.
        Nếu a chẵn thì tính tổng các số chẵn từ 0 đến a.
        Nếu a lẻ thì out chương trình

        System.out.println("Enter a:");
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (a%2==0){
            for (int i =0; i<=a; i+=2){
                sum+=i;}
            System.out.println("Tong cac so chan tu 0 den "+a+" = "+sum);       }
        else {
            System.out.println("a la so le");}*/

        /*Ex3: nhập n,tinh tổng từ 1 đến n.
        1. Nhập n=7, bỏ qua cộng tổng với số 3 r in ra kqua.
        2. Thử break khi vòng lặp chạy đến giá trị n=3.

        System.out.println("Enter n");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (n%2 !=0){
            for (int i =1; i<=n; i+=2){
                if (i==3) break;
               else sum+=i;
            }
            System.out.println(sum);
        }*/

        /*Ex4: Tim cac so chia het cho 3 tu 10 den 50.
        for (int i=10;i<=50; i++){
            if (i%3==0) {
                System.out.println(i);
            }
        }*/

        /*Ex5:Tinh tong S= 1!+2!+3!+...+10!
         */
        int sum = 0;
        for (int i = 0; i<=10;i++){

        }
    }
}
