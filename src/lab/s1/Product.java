package lab.s1;

public class Product {
    int id;
    String tensp;
    double gia;
    int sl;
    String doncvi;

    public void tangSL(int a){
        sl += a;
    }

    public void giamSL(int b){
        if(sl - b > 0);
        sl -= b;
    }

    public void thayDoiGia(int c){
        if(c > 0){
            sl += c;
        }else{
            sl = 0;
        }
    }

    public void kiemTraHang(){
        if(sl > 0){
            System.out.println("Con hang");
        }else{
            System.out.println("Het hang");
        }
    }

    public void inThongTin(){
        System.out.println("Ma san pham: "+id);
        System.out.println("Ten san pham: "+tensp);
        System.out.println("Gia tien: "+gia);
        System.out.println("So luong: "+sl);
        System.out.println("Don vi: "+doncvi);
    }
}
