package lab.s1;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.id = 1;
        p1.tensp = "San pham 1";
        p1.gia = 12000;
        p1.sl = 1;
        p1.doncvi = "chiec";

        Product p2 = new Product();
        p2.id = 2;
        p2.tensp = "San pham 2";
        p2.gia = 17000;
        p2.sl = 5;
        p2.doncvi = "chiec";

        Product p3 = new Product();
        p3.id = 3;
        p3.tensp = "San pham 3";
        p3.gia = 13000;
        p3.sl = 4;
        p3.doncvi = "chiec";

        p1.inThongTin();
        p2.inThongTin();
        p3.inThongTin();
    }
}
