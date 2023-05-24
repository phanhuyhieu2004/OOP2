package bai5;

import java.io.*;
import java.util.Scanner;

public class TH1 {
    public static void main(String args[]) {
        try {
//                     Tạo file person.dat
            File file = new File("src/bai5/person.dat");

//                   Tạo đối tượng FileOutputStream để ghi dữ liệu vào file đặt tên là person.dat
            FileOutputStream fos = new FileOutputStream(file);

//                     Nhập vào một chuỗi bất kỳ

            Scanner sc=new Scanner(System.in);
            System.out.println("Nhập vào :");
            String str=sc.nextLine();

//                  Ghi chuỗi nhập trên vào file
            fos.write(str.getBytes());

//                   Mở file kiểm tra dữ liệu trong file
            System.out.println("Nội dung file sau khi ghi:");
            FileInputStream fis = new FileInputStream(file);

//                     Đọc dữ liệu sử dụng phương thức read()
            int a;
            while ((a = fis.read()) != -1) {
                System.out.print((char) a);
            }
//    sử dụng một vòng lặp while để đọc dữ liệu từ đối tượng FileInputStream và sau đó chuyển đổi từng byte của dữ liệu đó thành ký tự và hiển thị trên màn hình console.

// Cụ thể, giá trị trả về của phương thức fis.read() là một byte của dữ liệu được đọc từ file. Trong khi giá trị trả về khác -1 (tức là chưa đọc hết file), chúng ta chuyển đổi byte đó thành ký tự bằng cách sử dụng ép kiểu (char) content và hiển thị ký tự đó trên màn hình console bằng phương thức System.out.print(). Khi đọc hết file, phương thức fis.read() sẽ trả về giá trị -1, và vòng lặp sẽ kết thúc.

            //  Đóng  FileInputStream/ FileOutputStream sau khi thực hiện đọc dữ liệu xong bằng việc sử dụng phương thức close()
            fis.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



