package bai5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class TH3 {

        public TH3() {
        }

        public static boolean writeData(String data, String fileName) {
            try {
                FileOutputStream outputStream = new FileOutputStream(fileName);
                byte[] bytes = data.getBytes();
                outputStream.write(bytes);
                outputStream.close();
                return true;
            } catch (IOException var4) {
                var4.printStackTrace();
                return false;
            }
        }

        public static String readData(String fileName) {
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                byte[] bytes = new byte[1024];
                int length = inputStream.read(bytes);
                inputStream.close();
                String data = new String(bytes, 0, length);
                return data;
            } catch (IOException var5) {
                var5.printStackTrace();
                return null;
            }
        }

        public static void main(String[] args) {
            String fileName = "data.dat";
            String resultData = readData(fileName);
            if (resultData != null) {
                System.out.println("Dữ liệu đọc được từ file:");
                System.out.println(resultData);
            } else {
                System.out.println("Đọc dữ liệu từ file thất bại!");
            }

        }

        class main {
            main(TH3 this$0) {
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập dữ liệu cần ghi vào file: ");
                String data = sc.nextLine();
                String fileName = "data.dat";
                boolean result = TH3.writeData(data, fileName);
                if (result) {
                    System.out.println("Ghi dữ liệu vào file thành công!");
                } else {
                    System.out.println("Ghi dữ liệu vào file thất bại!");
                }

            }
        }
    }

