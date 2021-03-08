package lab.s5_2;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.inputInfo();
        p.printInfo();

        Student s = new Student();
        s.inputInfo();
        s.printInfo();
        s.checkScholarship();

        Teacher t = new Teacher();
        t.inputInfo();
        for(String str:t.classes){
            System.out.println(str);
        }
        t.printInfo();


    }

}
