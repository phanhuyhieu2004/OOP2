package bai5;
import java.io.*;
public class TH2 {

            public static void main(String args[]) {
                try {
//                     Tạo file person.dat
                    File file = new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai5\\person.dat");

//                   Tạo đối tượng FileOutputStream để ghi dữ liệu vào file đặt tên là person.dat
                    FileOutputStream fos = new FileOutputStream(file);

//                     Nhập vào một chuỗi bất kỳ
                    String str = "Hello World!";

//                  Ghi chuỗi nhập trên vào file
                    fos.write(str.getBytes());

//                   Mở file kiểm tra dữ liệu trong file
                    System.out.println("Nội dung file sau khi ghi:");
                    FileInputStream fis = new FileInputStream(file);

//                     Đọc dữ liệu sử dụng phương thức read()
                    int content;
                    while ((content = fis.read()) != -1) {
                        // convert to char and display
                        System.out.print((char) content);
                    }

                    //  Đóng  FileInputStream/ FileOutputStream sau khi thực hiện đọc dữ liệu xong bằng việc sử dụng phương thức close()
                    fis.close();
                    fos.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



