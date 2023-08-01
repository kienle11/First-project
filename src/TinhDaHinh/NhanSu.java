package TinhDaHinh;

public abstract class NhanSu {
    private String name;
    private String cccd;
    private String address;

    public NhanSu(String name, String cccd, String address) {
        this.name = name;
        this.cccd = cccd;
        this.address = address;
    }

    public NhanSu() {
    }

    public String getName() {
        return name;
    }

    public String getCccd() {
        return cccd;
    }

    public String getAddress() {
        return address;
    }

    public abstract double salary(int workDay);

    @Override
    public String toString() {
        return "NhanSu{" +
                "name='" + name + '\'' +
                ", cccd='" + cccd + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
