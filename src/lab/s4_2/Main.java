package lab.s4_2;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setMaso(1);
        sv1.setHoten("Nguyen Van A");
        sv1.setSdt("0123456789");
        sv1.setDiachi("Ha Noi");

        SinhVien sv2 = new SinhVien();
        sv2.setMaso(2);
        sv2.setHoten("Nguyen Van B");
        sv2.setSdt("0123456788");
        sv2.setDiachi("Ha Nam");

        LopHoc lh = new LopHoc();
        lh.setMalop(1);
        lh.setTenlop("T2009M");
        lh.setPhong(8);
        lh.themSV(sv1);
        lh.xoaSV(sv2);
        lh.inDS();

    }
}
