package Enum;

public enum XepLoai {
   Gioi ("XL giỏi"),
    Kha ("XL Khá"),
    TB ("XL TB"),
    Yeu ("XL Yếu"),
    DuoiHoc("Đuổi học");
   private String msg;
   XepLoai(String msg){
       this.msg = msg;
   }
   public String des (){
       return this.msg;
   }
}
