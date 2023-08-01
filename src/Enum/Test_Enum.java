package Enum;

import java.util.ArrayList;

public class Test_Enum {
    public static void main(String[] args) {
        //Ktra thứ tự giá trị trong enum
        System.out.println(XepLoai.Kha.ordinal());
        System.out.println(XepLoai.Yeu.ordinal());
        //Tạo list
        ArrayList<Svien> ds = new ArrayList<>();
        //Tạo đối tượng
        Svien sv1 = new Svien(1, "Kien",9.5);
        Svien sv2 = new Svien(2, "Kien trung",3);
        Svien sv3 = new Svien(3, "Kien le",7);
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        for (Svien thongTin: ds){
            System.out.println(thongTin);
        }
    }
}
