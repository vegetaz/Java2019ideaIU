package HelloWorld;
/*
* Bảng cửu chương
* */
public class BangCuuChuong {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " x " + j + " = " + i * j + "\t");
            }
            System.out.println("");
        }
    }
}
