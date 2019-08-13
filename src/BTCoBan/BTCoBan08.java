package BTCoBan;

import java.util.ArrayList;
import java.util.Date;

public class BTCoBan08 {
    public static void main(String[] args) {
        //Khai báo
        ArrayList aThongTin = new ArrayList();
        //Gán giá trị
        aThongTin.add("Nguyễn Văn Vận");
        aThongTin.add("25/10/1989");
        aThongTin.add(new Date());
        //Hiển thị thông tin
        System.out.println("Mảng danh sách động");
        for (Object object : aThongTin) {
            System.out.println(object);
        }
    }
}
