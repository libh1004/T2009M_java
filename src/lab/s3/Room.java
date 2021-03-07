package lab.s3;

import java.util.ArrayList;

public class Room {
    public String name;
    public String position;
    public ArrayList<String> users;

    public Room(){
        users = new ArrayList<String>();
    }

    public void showInfo(){
        System.out.println("Ten phong: "+name);
        System.out.println("Vi tri phong: "+position);
        System.out.println("Danh sach nguoi dung: ");
    }
    public void addUser(String user){
        users.add(user);
        System.out.println("Them 1 nguoi vao danh sach "+user);
    }

    public void removeUser(int index){
        users.remove(index);
        System.out.println("Xoa 1 nguoi khoi danh sach "+index);
    }
}
