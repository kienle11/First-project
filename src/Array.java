import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng :");
     int n = Integer.parseInt(scanner.nextLine());
     int arrays []= new int[n];
     /*for (int i=0; i<n;i++) {
         System.out.println("Nhập phần tử thứ " + (i + 1));
         int x = Integer.parseInt(scanner.nextLine());
         arrays[i] = x;
     }
     System.out.println(Arrays.toString(arrays));*/

     /*   System.out.println("Thêm 1 phần tử vào mảng:");
     int arrayNew[] = new int[n+1];
     for (int i=0; i<n; i++){
         arrayNew[i]= arrays[i];
     }
        System.out.println("Nhập thêm phần tử");
     int value = Integer.parseInt(scanner.nextLine());
     arrayNew[n]=value;
        System.out.println(Arrays.toString(arrayNew));*/

      /*  System.out.println("Nhap so dong: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot");
        int column = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[row][column];
        int arr1[][] = new int[row][column];
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhap du lieu a[" + i + "] [" + j + "]");
                int x = Integer.parseInt(scanner.nextLine());
                arr[i][j] = x;

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhap du lieu b[" + i + "] [" + j + "]");
                int x1 = Integer.parseInt(scanner.nextLine());
                arr1[i][j] = x1;

            }

        }*/

// Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
//Nhập các phần tử mảng
//In mảng ra màn hình
//Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
//VD: [1,4,7,6,2,3] -> [1,5,7,7,3,3]
        for (int i=0; i<n;i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            int x = Integer.parseInt(scanner.nextLine());
            arrays[i] = x;
            }
            System.out.println(Arrays.toString(arrays));
        for (int i=0; i<n;i++) {
            if (arrays[i]%2==0){
                arrays[i]++;
            }
        }
        System.out.println(Arrays.toString(arrays));

        }


    }




