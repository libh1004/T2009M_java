package TestADF1;

import java.util.Scanner;

public class Motor implements Vehicle{
    String name;
    @Override
    public float moveMax() {
        float max = 150;
        System.out.println("Van toc toi da cua xe may la: "+max);
        return max;
    }

    @Override
    public String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua xe may: ");
        name = sc.nextLine();
        return name;
    }
}
