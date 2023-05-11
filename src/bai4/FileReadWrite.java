package bai4;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        // Ghi dữ liệu vào tệp văn bản
        try (FileWriter writer = new FileWriter("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\filereader")) {
            writer.write("Xin chào ...");
        } catch (IOException e) {
            System.out.println("Lỗi ghi vào tập tin: " + e.getMessage());
        }

        // Đọc dữ liệu từ tệp văn bản và hiển thị ra màn hình
        try (FileReader reader = new FileReader("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\filereader")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi vào tập tin: " + e.getMessage());
        }
    }
}
