package lab.s2_2;

public class PhanSo {
    public double tuso;
    public double mauso;

    public PhanSo(){

    }

   public void nhapPhanSo(){
       System.out.println("Nhap tu so: ");
       System.out.println("Nhap mau so: ");

   }
   public void inPhanSo(){
       System.out.println("Tu so: "+tuso);
       System.out.println("Mau so: "+mauso);

   }
   public double rutGonPhanSo(){
       int ucln = 1;
       for(int i = 1;i<= tuso && i<= mauso;i++){
           if(i > ucln){
               ucln = i;
               if(tuso % ucln == 0 && mauso % ucln == 0) {
                   double kq = (tuso / ucln) / (mauso / ucln);
                   return kq;
               }
           }
       }
       return 0;
   }

   public double nghichDaoPhanSo(){
        return 1/(tuso / mauso);
   }

   public double add(PhanSo ps2){
        return tuso/mauso + ps2.tuso/ ps2.mauso;
   }

   public double sub(PhanSo ps2){
        return tuso/mauso - ps2.tuso/ps2.mauso;
   }
    public double mul(PhanSo ps2){

        return tuso/mauso * ps2.tuso/ps2.mauso;
    }
    public double div(PhanSo ps2){

        return tuso/mauso / ps2.tuso/ps2.mauso;
    }


    public double getTuso() {

        return tuso;
    }

    public void setTuso(double tuso) {

        this.tuso = tuso;
    }

    public double getMauso() {

        return mauso;
    }

    public void setMauso(double mauso) {
        this.mauso = mauso;
    }
}
