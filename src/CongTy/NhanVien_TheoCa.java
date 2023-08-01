package CongTy;

public class NhanVien_TheoCa extends NhanVien{
    protected int shift;
    public NhanVien_TheoCa(String name, String home, int id) {
        super(name, home, id);
    }

    public NhanVien_TheoCa(String name, String home, int id, int shift) {
        super(name, home, id);
        this.shift = shift;
    }

    @Override
    public double calculateSalary() {
        return salary*1.05;
    }
}
