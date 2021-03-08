package lab.s5_2;

import java.util.Scanner;

public class Person {
    String name;
    String gender;
    String birthday;
    String address;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        this.gender = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.birthday = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.address = sc.next();

    }

    public void printInfo(){
        System.out.println("Ten: "+this.name);
        System.out.println("Gioi tinh: "+this.gender);
        System.out.println("Ngay sinh: "+this.birthday);
        System.out.println("Dia chi: "+this.address);
    }
}
