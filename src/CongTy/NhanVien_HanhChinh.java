package CongTy;

public class NhanVien_HanhChinh extends NhanVien{

    public NhanVien_HanhChinh(String name, String home, int id) {
        super(name, home, id);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
