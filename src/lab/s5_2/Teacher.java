package lab.s5_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person{
    public double salary;
    public int numofsubject;
    public String subjects;

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap muc luong: ");
        this.salary = sc.nextDouble();
        System.out.println("Nhap so mon giang day: ");
        this.numofsubject = sc.nextInt();
        System.out.println("Nhap cac mon giang day: ");
        this.subjects = sc.next();

    }
    public void printInfo(){
        System.out.println("Muc luong: "+this.salary);
        System.out.println("So mon giang day: "+this.numofsubject);
        System.out.println("Cac mon giang day: "+this.subjects);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumofsubject() {
        return numofsubject;
    }

    public void setNumofsubject(int numofsubject) {
        this.numofsubject = numofsubject;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
