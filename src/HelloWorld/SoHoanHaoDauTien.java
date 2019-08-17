package HelloWorld;
/*
* In ra màn hình 5 số hoàn hảo đầu tiên
* Số hoàn hảo là số có tổng các ước số bằng chính nó.
* Note: Chạy hơi lâu~~~
* */
public class SoHoanHaoDauTien {
    public static void main(String[] args) {
        int n = 0;
        int i = 0;
        int j;
        int s;
        while (i < 5) {
            n++;
            s = 1;
            for (j = 2; j < n; j++) {
                if (n % j == 0) {
                    s += n;
                }
            }
            if (n == s) {
                System.out.print(n + " ");
                i++;
            }
        }
        System.out.println("");
    }
}
