package bai4;

import java.io.File;
import java.io.IOException;

public class Vi_du_tao_tap_tin_va_thu_muc {
//    Lứu ý:Window :\ =)\\
    public static void main(String[] args) {
        File folder1=new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\th");
        System.out.println(folder1.exists());
        File d1=new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\d1");
        d1.mkdir();
//        phương thức mkdir là tạo 1 thư mục
File d2=new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\d1\\d2\\d3");
d2.mkdirs();
        File file1=new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\d1\\Vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
//    khi lap trinh,người dùng phải được cho phép truy cập tập tin,tạo thư mục
//    ổ cứng bị đầy

}
