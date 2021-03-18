package TestADF1;

import java.util.Scanner;

public class Car implements Vehicle{
    String name;
    @Override
    public float moveMax() {
        float max = 250;
        System.out.println("Van toc toi da cua o to: "+max);
        return max;
    }

    @Override
    public String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua o to: ");
        name = sc.nextLine();
        return name;
    }
}
