package CongTy;

public class Test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien("nhan vien 1","hanoi",1);
        double salaryNv1= nv1.calculateSalary();
        System.out.println(salaryNv1); */
        NhanVien_HanhChinh hc1 = new NhanVien_HanhChinh("hanh chinh1","sai gon",2);
        double salaryHc1 = hc1.calculateSalary();
        System.out.println(salaryHc1);
        NhanVien_TheoCa ca1 = new NhanVien_TheoCa("ca 1","nghe an",3);
        double salaryCa1 = ca1.calculateSalary();
        System.out.println(salaryCa1);
        NhanVien_TheoCa ca2 = new NhanVien_TheoCa("ca 2","hanoi",4, 2);
        double salaryCa2 = ca2.calculateSalary();
        System.out.println(salaryCa2);
    }
}
