package QuanLy_Diem;

public class Khoa_Toan extends Namhoc2023{
    public Khoa_Toan(String name, String cccd) {
        super(name, cccd);
    }

    @Override
    public void tinhDiemTB() {
        System.out.println("Day la phuong tich tinh diem cua khoa toan");
    }
}
