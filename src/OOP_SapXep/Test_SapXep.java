package OOP_SapXep;

import java.util.ArrayList;
import java.util.Collections;

public class Test_SapXep {
    public static void main(String[] args) {
        //Tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
        //Khởi tạo đối tượng
        SanPham sp1 = new SanPham(1,"Samsung",1000);
        SanPham sp2 = new SanPham(2,"bamphone",100);
        SanPham sp3 = new SanPham(3,"iphone",200);
        //add sp vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        for (SanPham sp: ds){
            System.out.println(sp);
        }
        //gọi phương thức sắp xếp theo giá tăng dần
        Collections.sort(ds);
        System.out.println("Danh sách sau sắp xếp");
        for (SanPham sp: ds){
            System.out.println(sp);
        }
    }
}
