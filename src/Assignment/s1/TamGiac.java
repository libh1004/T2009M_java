package Assignment.s1;

public class TamGiac {
    int a;
    int b;
    int c;

    boolean KiemTraTg(){
        if(a+b > c && a+c > b && c+b > a) return true;
        return false;
    }
    int TinhChuVi(){
        return a+b+c;
    }
    double TinhDienTich(){
        int P = TinhChuVi();
        return Math.sqrt(P*(P-a)*(P-b)*(P-c));
    }
}