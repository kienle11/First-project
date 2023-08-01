package CongTy;

public abstract class NhanVien {
    protected String name ;
    protected String home;
    protected int id;
    protected double salary = 850;

    public NhanVien(String name, String home, int id) {
        this.name = name;
        this.home = home;
        this.id = id;
    }
    public abstract double calculateSalary ();
}
