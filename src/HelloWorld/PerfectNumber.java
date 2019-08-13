package HelloWorld;

import java.util.Scanner;

/*
* Kiểm tra một số có phải số hoàn hảo hay không?
* Số hoàn hảo là số có tổng các ước số bằng chính nó.
* Ví dự 1 + 2 + 3 = 6.
* */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.print("Nhập vào số nguyên: ");
        num = sn.nextInt();

        while (num < 0) {
            System.out.println("Phải là số nguyên dương!");
            System.out.print("Mời nhập lại: ");
            num = sn.nextInt();
        }

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum+= i;
            }
        }

        if (num == sum) {
            System.out.printf("Số %d là số hoàn hảo!\n", num);
        }
        else
            System.out.printf("Số %d không là số hoàn hảo!\n", num);

    }
}
