// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
      Scanner scanner = new Scanner(System.in);
Random random=new Random();
      System.out.println("Moi nhap so lieu");
int a = scanner.nextInt();
int b = random.nextInt(100)+1;
String answer = (a == b) ? "2 so bang nhau":
        (a>b)? "So ban nhap lon hon":"So ban nhap nho hon";
        System.out.println(answer);
    }
}