package HelloWorld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Bạn tên là gì?");
        System.out.print("> ");
        name = sc.nextLine();
        System.out.println("Xin chao bạn " + name);
    }
}
