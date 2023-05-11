package bai4;

import java.io.*;
import java.util.Scanner;

public class TH_ReadFileExample {
    public void readFileText(String filePath){

        try {
            // Đọc file theo đường dẫn
            File file = new File("C:\\Users\\Dell\\IdeaProjects\\OOP2\\src\\bai4\\th");


            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng các số trong file: " + sum);
        } catch (NumberFormatException e) {
            System.err.println("Nội dung file không đúng định dạng số nguyên!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
//Tạo 1 đối tượng path để in ra số
        TH_ReadFileExample readfileEx = new TH_ReadFileExample();
        readfileEx.readFileText(path);

    }

}


