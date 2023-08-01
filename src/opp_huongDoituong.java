import TruongDaihoc.SinhVien;

public class opp_huongDoituong {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThithongtin();
        sv2.hienThithongtin();
        SinhVien sv3 = new SinhVien("kien");
        sv3.hienThithongtin();
    SinhVien sv4 = new SinhVien("Son",9);
    sv4.hienThithongtin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        //thay doi ten sv4
        sv4.setHoTen("Kien");
        sv4.hienThithongtin();
    sv4.setDiem(8.5);
    sv4.hienThithongtin();
    //phuong thuc co kieu tra ve
        double diemTBsv4 = sv4.tinhDiemTB(7,8);
        System.out.println(diemTBsv4);
        System.out.println(sv4);
    }
}
