import java.util.Scanner;

public class Break_coutinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen");
        int n = scanner.nextInt();
        int gt = 1;
        for (int i = 1; i<=n; i++){
            gt*=i;
            System.out.println(gt);
        }
    }
}
