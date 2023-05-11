package bai4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteMethod {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\fileReadWriteMethod";
        String data = "Xin chào";

        // Ghi dữ liệu vào file
        boolean success = writeToFile(fileName, data);
        if (success) {
            System.out.println("Ghi dữ liệu vào file thành công.");
        } else {
            System.out.println("Ghi dữ liệu vào file thất bại.");
        }

        // Đọc dữ liệu từ file
        String fileContent = readFromFile(fileName);
        System.out.println("Dữ liệu đọc được từ file là: " + fileContent);
    }

    // Phương thức để đọc dữ liệu từ file
    public static String readFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                sb.append((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    // Phương thức để ghi dữ liệu vào file
    public static boolean writeToFile(String fileName, String data) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}