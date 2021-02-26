package lab.s2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();

        ps1.tuso = sc.nextDouble();
        ps1.mauso = sc.nextDouble();

        ps1.nhapPhanSo();
        ps1.inPhanSo();
        System.out.println("Rut gon cua phan so la: "+ps1.rutGonPhanSo());
        System.out.println("Nghich dao cua phan so : "+ps1.nghichDaoPhanSo());

        PhanSo ps2 = new PhanSo();
        ps2.tuso = sc.nextDouble();
        ps2.mauso = sc.nextDouble();
        System.out.println("Tong 2 phan so: "+ ps1.add(ps2));
        System.out.println("Hieu 2 phan so: "+ ps1.sub(ps2));
        System.out.println("Tich 2 phan so: "+ ps1.mul(ps2));
        System.out.println("Thuong 2 phan so: "+ ps1.div(ps2));









    }
}
