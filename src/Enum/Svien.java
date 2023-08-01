package Enum;

public class Svien {
    //Thuộc tinh
    private int id;
    private String name;
    private double point;
    private XepLoai rank;

    public Svien(int id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
        this.rank = getRank();
    }
    //Phương thức để phân loại
    public XepLoai getRank(){
        if (this.point>=8)
            rank = XepLoai.Gioi;
        else if (this.point>=6.5) {
            rank = XepLoai.Kha;
        }
        else if (this.point>=5.0) {
            rank = XepLoai.TB;
        }
        else if (this.point>=3.0) {
            rank = XepLoai.Yeu;
        }
        else rank = XepLoai.DuoiHoc;
        return rank;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", point=" + point +
                ", rank=" + rank.des();
    }
}
