package HelloWorld;

import java.util.Scanner;

/*
* Tìm phần tử lớn thứ hai trong mảng
* */
public class PTLonThu2TrongMang {
    public static void main(String[] args) {
        int a[] = new int[10];
        int max = 0;
        int max2 = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            if (i == 0) {
                max = a[0];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        for (int j = 0; j < 10; j++) {
            if (a[j] > max2 && a[j] < max) {
                max2 = a[j];
            }
        }
        System.out.print("Phần tử lớn thứ hai trong mảng là: " + max2);
    }
}
