package bai4;

import java.io.File;

public class CreateFileExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\CreateFile.java";
        File file = new File(fileName);

        // Kiểm tra xem file đã tồn tại hay chưa
        if (file.exists()) {
            System.out.println("File đã tồn tại.");
        } else {
            System.out.println("File chưa tồn tại.");
        }

        // Kiểm tra xem file có phải là thư mục hay không
        if (file.isDirectory()) {
            System.out.println("File là một thư mục.");
        } else {
            System.out.println("File không phải là một thư mục.");
        }

        // Hiển thị đường dẫn của file
        System.out.println("Đường dẫn của file là: " + file.getAbsolutePath());
    }
}
