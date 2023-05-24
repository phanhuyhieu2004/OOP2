package bai4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        // Chuỗi dữ liệu cần lưu vào tệp văn bản
        String data = "Xon chào!";

        // Ghi dữ liệu vào tệp văn bản
        try (FileWriter writer = new FileWriter("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\filereader")) {
            writer.write(data);

        } catch (IOException e) {
            System.out.println("Lỗi ghi vào tập tin: " + e.getMessage());
        }
    }
}