package lab.s3;

public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        r.name = "Phong A8";
        r.position = "Tang 1";
        r.showInfo();
        r.addUser("Nguyen Van A");
        r.addUser("Nguyen Van B");
        r.removeUser(1);
        for(String s:r.users){
            System.out.println(s);
        }
    }
}
