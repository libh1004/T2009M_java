package lab.s3;

import java.util.ArrayList;

public class Room {
    public int tenp;
    public String vitri;
    public ArrayList<String> dsnd ;

    public Room(){

        dsnd = new ArrayList<>(); //cap o nho
    }
    public void inthongtin(){
        System.out.println("Ten phong: "+tenp);
        System.out.println("Vi tri: "+vitri);
        System.out.print("Danh sach nguoi dung:");
        for(int i = 0;i<dsnd.size();i++){
            System.out.println(dsnd.get(i));
        }
    }

    public void addUser(String user1){
        dsnd.add(user1);
        System.out.println("Them 1 nguoi vao danh sach: "+user1);


    }
//    public void removeUser(String user2){
//        user2  = new String();
//        dsnd.remove(user2);
//        System.out.println("Xoa 1 nguoi vao danh sach: "+user2);
//
//    }

//    public void removeUser(int index);
//    dsnd.remove(index);

    //



}
