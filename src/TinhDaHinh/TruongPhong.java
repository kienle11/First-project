package TinhDaHinh;

public class TruongPhong extends NhanSu{
    public TruongPhong(String name, String cccd, String address) {
        super(name, cccd, address);
    }

    public TruongPhong() {
    }

    @Override
    public double salary(int workDay) {
        return 50*workDay; // 50$/day
    }
}
