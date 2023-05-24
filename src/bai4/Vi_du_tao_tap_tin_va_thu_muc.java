package bai4;

import java.io.File;
import java.io.IOException;

//Trong java có đối tượng file có thể tương tác được với thu mục,tập tin cụ thể

public class Vi_du_tao_tap_tin_va_thu_muc {
//    Lứu ý:Window :\ =)\\
    public static void main(String[] args) {
//        kiểm tra xem thư mục có tồn tại hay không?
        File folder1=new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\th");
        System.out.println(folder1.exists());
        File d1=new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\d1");
        d1.mkdir();
//        phương thức mkdir là tạo 1 thư mục/nhiều thư mục cùng lúc
File d2=new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\d1\\d2\\d3");
d2.mkdirs();
//Tạo tập tin(có phần mở rộng:.exe,.txt,.doc,.xls..)
        File file1=new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\d1\\Vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
//    ổ cứng bị đầy
//không có quyền tạo tập tin
//    đưa cho đường dẫn bị sai
}
//        Khi lập trình trên các hđh,tạo ra nhiều người duùng,không phải người dùng nào cũng có quyền tương tác,khi mà copy vào 1 file trong ổ c,sẽ bị window báo lỗi có cho phép hay không
