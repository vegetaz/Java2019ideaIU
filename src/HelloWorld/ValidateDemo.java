package HelloWorld;

import java.util.Scanner;

/*
* Validate có nghĩa là yêu cầu người sử dụng phải nhập đúng dữ liệu theo mong muốn của người lập trình
* Ví dụ: Yêu cầu nhập vào tuổi của một người. age > 0
* Hiện tại tuổi của con người không nhỏ hơn không và không vượt quá 200 tuổi
* */
public class ValidateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Mời nhập vào tuổi: ");
        age = sc.nextInt();
        while (age <= 0 || 200 < age) {
            System.out.println("Bạn phải nhập vào tuổi người > 0 và tuổi <= 200");
            System.out.print("Mời nhập vào tuổi: ");
            age = sc.nextInt();
        }
        System.out.println("Tuổi bạn vừa nhập là: " + age);
    }
}
