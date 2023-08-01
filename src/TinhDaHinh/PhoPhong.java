package TinhDaHinh;

public class PhoPhong extends NhanSu{
    public PhoPhong(String name, String cccd, String address) {
        super(name, cccd, address);
    }

    @Override
    public double salary(int workDay) {
        return 40*workDay; // 40$/day
    }

}
