package lab.s5_2;

import java.util.Scanner;

public class Student extends Person{
    public int id;
    public double mark;
    public String email;

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        this.id = sc.nextInt();
        System.out.println("Nhap diem thi: ");
        this.mark = sc.nextDouble();
        System.out.println("Nhap email: ");
        this.email = sc.next();

    }

    public void printInfo(){
        System.out.println("Ma sinh vien: "+this.id);
        System.out.println("Diem thi: "+this.mark);
        System.out.println("Email: "+this.email);
    }

    public void checkScholarship(){
        if(mark > 8.0){
            System.out.println("Duoc hoc bong");
        }else{
            System.out.println("Khong duoc hoc bong");
        }
    }
}
