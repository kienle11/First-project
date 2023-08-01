package OOP_SapXep;

public class SanPham implements Comparable<SanPham>{
//Thuoc tính
    private int id;
    private String name;
    private double price;

    public SanPham(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
//get,set

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+price;
    }

    @Override
    public int compareTo(SanPham o) {
        return this.name.compareToIgnoreCase(o.name);
    }

   /* @Override
    public int compareTo(SanPham o) {
        if (this.price<o.price)
            return -1;
        if (this.price>o.price)
            return 1;
        return 0;
    }*/
}
