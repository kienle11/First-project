package HinhHoc;

import java.util.logging.Level;

public class Retangle extends Sharp {
    private double length;
    private double width;

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void infor() {
        System.out.println("Dien tich hinh chu nhat "+calculateS());
        System.out.println("Chu vi hinh chu nhat "+calculateP());
    }

    @Override
    public double calculateP() {
        return (length+width)*2;
    }

    @Override
    public double calculateS() {
        return length*width;
    }
}
