package Assignment.s1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TamGiac tg = new TamGiac();
        tg.a = sc.nextInt();
        tg.b = sc.nextInt();
        tg.c = sc.nextInt();

        int chuvi = 0;
        double dientich = 0;
        if(tg.KiemTraTg() == true){
            chuvi = tg.TinhChuVi();
            dientich = tg.TinhDienTich();
            System.out.println("Chu vi tam giac: "+chuvi);
            System.out.println("Dien tich tam giac: "+dientich);
            return;
        }
        System.out.println("Vui long nhap lai");
    }
}

