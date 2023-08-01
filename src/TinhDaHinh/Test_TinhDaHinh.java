package TinhDaHinh;

public class Test_TinhDaHinh {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Kien","1", "Hanoi");
        System.out.println(ns1.getName()+" , "+ns1.getCccd()+" ");
        System.out.println(ns1.salary(20));
        ns1 = new TruongPhong(ns1.getName(), ns1.getCccd(), ns1.getAddress());
        System.out.println("ns1 dang lam truong phong");
        System.out.println(ns1.salary(20));
        System.out.println(ns1.getName()+" , "+ns1.getCccd()+" ");



    }
}
