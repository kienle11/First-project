package Interface;

public class Ke_Thua_Interface implements Vidu_Interface{
    @Override
    public void thongTin(String name, String cccd, int yearBorn) {

    }

    @Override
    public double salary(double luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
    }
}
