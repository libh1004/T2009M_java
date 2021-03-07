package lab.s4_2;

import java.util.ArrayList;

public class LopHoc {
    int malop;
    String tenlop;
    int phong;
    ArrayList<SinhVien> dssv;

    public LopHoc(){
        dssv = new ArrayList<SinhVien>();
    }
    public void themSV(SinhVien sv1){
        dssv.add(sv1);
    }
    public void xoaSV(SinhVien sv2){
        dssv.remove(sv2);
    }
    public void inDS(){
        for(SinhVien sv:dssv){
            System.out.println("Ma so: "+sv.getMaso());
            System.out.println("Ten: "+sv.getHoten());
            System.out.println("So dien thoai: "+sv.getSdt());
            System.out.println("Dia chi: "+sv.getDiachi());
        }
    }

    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public int getPhong() {
        return phong;
    }

    public void setPhong(int phong) {
        this.phong = phong;
    }

}
