package HelloWorld;

import java.util.Scanner;

/*
* Số Đối Xứng - Symmetric Number
* */
public class SoDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; //Số ban đầu
        int reverse = 0; //Số đảo ngược
        int temp;

        System.out.print("Nhập vào số đối xứng: ");
        num = sc.nextInt();
        temp = num;

        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10; // temp = temp / 10;
        }

        if (reverse == num) {
            System.out.println("Số " + num + " là số đối xứng!");
        }
        else
            System.out.println("Số " + num + " không là số đối xứng!");
    }
}
