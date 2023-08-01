package TruongDaihoc;

public class SinhVien {
    private String hoTen;
    private double diem;

    public SinhVien(){
        hoTen="no name";
        diem= 0.0;
    }
public SinhVien(String hoTen){
        this.hoTen=hoTen;
}
public SinhVien(String hoTen, double diem){
        this.hoTen = hoTen;
        this.diem = diem;
}

    public void hienThithongtin(){
        System.out.println(hoTen+":"+diem);
    }
//phuong thuc co kieu tra ve
     public double tinhDiemTB( double diemToan, double diemVan){

        return (diemToan+diemVan)/2;
     }


    //get, set

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }
}
