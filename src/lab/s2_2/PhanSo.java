package lab.s2_2;

import java.util.Scanner;

public class PhanSo {
    public int tuso;
    public int mauso;

    public PhanSo() {

    }

    //lab s2 2
    // lab3
    // lab4
    public void nhapPS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        this.tuso = sc.nextInt();
        System.out.println("Nhap mau so: ");
        this.mauso = sc.nextInt();
    }

    public void inPS() {
        System.out.println("Phan so: " + this.tuso + "/" + this.mauso);
    }

    public void rutGon() {
        int ucln = 0;
        for (int i = 1; i <= tuso && i <= mauso; i++) {
            if (tuso % i == 0 && mauso % i == 0) {
                if (i > ucln) {
                    ucln = i;
                }

            }
        }
        setTuso(getTuso()/ucln);
        setMauso(getMauso()/ucln);
    }

    public void nghichDao() {
        if (getMauso() != 0) {
            int temp = getTuso();
            setTuso(getMauso());
            setMauso(temp);
           return;
        }
    }

    public PhanSo add(PhanSo ps2){
        int a = getTuso()*ps2.getMauso()+getMauso()*ps2.getTuso();
        int b = getMauso()*ps2.getMauso();
        PhanSo tong = new PhanSo();
        tong.setTuso(a);
        tong.setMauso(b);
        return tong;
    }

    public PhanSo sub(PhanSo ps2){
        int a = getTuso()*ps2.getMauso()-getMauso()*ps2.getTuso();
        int b = getMauso()*ps2.getMauso();
        PhanSo hieu = new PhanSo();
        hieu.setTuso(a);
        hieu.setMauso(b);
        return hieu;

    }
    public PhanSo mul(PhanSo ps2){
        int a = getTuso()*ps2.getTuso();
        int b = getMauso()*ps2.getMauso();
        PhanSo tich = new PhanSo();
        tich.setTuso(a);
        tich.setMauso(b);
        return tich;

    }
    public PhanSo div(PhanSo ps2){
        int a = getTuso()*ps2.getMauso();
        int b = getMauso()*ps2.getTuso();
        PhanSo thuong = new PhanSo();
        thuong.setTuso(a);
        thuong.setMauso(b);
        return thuong;

    }
    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
}


