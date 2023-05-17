package bai5;

import java.io.*;

import java.util.Scanner;

public class TH2 {
    public static boolean writeData(String data, String fileName) throws IOException {
        // Mở file để ghi dữ liệu
        FileOutputStream fos = new FileOutputStream("data.dat");

        // Chuyển đổi dữ liệu từ kiểu String sang kiểu byte
        byte[] dataBytes = data.getBytes();

        // Ghi dữ liệu vào file
        fos.write(dataBytes);

        // Đóng file
        fos.close();

        return true;
    }

//    Phương thức có kiểu trả về là boolean, trả về true nếu quá trình ghi dữ liệu thành công và ngược lại.
//    Phương thức nhận vào hai tham số: data là chuỗi dữ liệu cần ghi vào file, fileName là tên file mà dữ liệu sẽ được ghi vào.
//    Trong quá trình thực hiện ghi dữ liệu, nếu có lỗi xảy ra, phương thức sẽ ném ra ngoại lệ IOException.
//    Phương thức sử dụng đối tượng FileOutputStream để mở file và ghi dữ liệu vào file.
//    Dữ liệu được chuyển đổi từ kiểu String sang kiểu byte bằng cách sử dụng phương thức getBytes() của lớp String.
//    Sau khi ghi dữ liệu xong, phương thức đóng file bằng cách sử dụng phương thức close() của đối tượng FileOutputStream.

    public static String readData(String fileName) throws IOException {
        // Mở file để đọc dữ liệu
        FileInputStream fis = new FileInputStream("data.dat");

        // Tạo một mảng byte để lưu dữ liệu đọc được từ file
        byte[] dataBytes = new byte[(int) fis.available()];

        // Đọc dữ liệu từ file
        fis.read(dataBytes);

        // Chuyển đổi dữ liệu từ kiểu byte sang kiểu String
        String data = new String(dataBytes);

        // Đóng file
        fis.close();

        return data;
//        Phương thức có kiểu trả về là String, trả về chuỗi dữ liệu đọc được từ file.
//        Phương thức nhận vào một tham số là fileName, là tên file mà dữ liệu sẽ được đọc ra.
//                Trong quá trình thực hiện đọc dữ liệu, nếu có lỗi xảy ra, phương thức sẽ ném ra ngoại lệ IOException.
//                Phương thức sử dụng đối tượng FileInputStream để mở file và đọc dữ liệu từ file.
//                Ta tạo một mảng byte để lưu dữ liệu đọc được từ file.
//                Sau khi đọc dữ liệu từ file, phương thức chuyển đổi dữ liệu từ kiểu byte sang kiểu String bằng cách sử dụng constructor của lớp String.
//        Cuối cùng, phương thức đóng file bằng cách sử dụng phương thức close() của đối tượng FileInputStream
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập dữ liệu cần ghi vào file: ");
//        String data = scanner.nextLine();
//
//        System.out.print("Nhập tên file: ");
//        String fileName = scanner.nextLine();
//            try {
//                if (writeData(data, fileName)) {
//                    System.out.println("Ghi dữ liệu vào file thành công");
//                }
//            } catch (IOException e) {
//                System.out.println("Lỗi khi ghi dữ liệu vào file: " + e.getMessage());
//            }
//        }
        Scanner scanner = new Scanner(System.in);

        String fileName = "data.dat";

        try {
            String resultData = readData(fileName);
            System.out.println("Dữ liệu trong file là: " + resultData);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc dữ liệu từ file: " + e.getMessage());
        }
    }
}

//    Trong chương trình này, ta sử dụng đối tượng Scanner để nhập tên file cần đọc dữ liệu từ bàn phím.
//        Sau đó, ta gọi phương thức readData() và truyền vào tên file để đọc dữ liệu từ file.
//        Nếu phương thức trả về chuỗi dữ liệu, ta hiển thị dữ liệu đọc được ra màn hình. Nếu phương thức ném ra ngoại lệ IOException, ta hiển thị thông báo lỗi và in ra thông tin về ngoại lệ.



//    Trong chương trình này, ta sử dụng đối tượng Scanner để nhập dữ liệu từ bàn phím.
//    Sau đó, ta gọi phương thức writeData() và truyền vào dữ liệu cần ghi và tên file để ghi dữ liệu vào.
//    Nếu phương thức trả về true, ta hiển thị thông báo ghi dữ liệu vào file thành công. Nếu phương thức ném ra ngoại lệ IOException, ta hiển thị thông báo lỗi và in ra thông tin về ngoại lệ.

