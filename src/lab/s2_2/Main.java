package lab.s2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PhanSo ps = new PhanSo();
        ps.setTuso(sc.nextInt());
        ps.setMauso(sc.nextInt());

        PhanSo ps2 = new PhanSo();
        ps2.setTuso(sc.nextInt());
        ps2.setMauso(sc.nextInt());
    }
}
