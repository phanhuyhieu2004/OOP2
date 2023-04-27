package bai3;

import java.util.Scanner;

public class CalculationExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Tạo một đối tượng Scanner để đọc dữ liệu đầu vào từ bàn phím.
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();

        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
//        Gọi phương thức calculate của đối tượng CalculationExample để tính toán các phép toán.

    }
//    Định nghĩa phương thức calculate để tính toán các phép toán và in ra kết quả.
    private void calculate(int x, int y) {
//        Sử dụng câu lệnh try-catch để bắt các ngoại lệ có thể xảy ra trong quá trình tính toán. Nếu xảy ra ngoại lệ, in ra thông báo lỗi.
        try {
            // Tính toán các phép toán cộng, trừ, nhân, chia
           int a = x + y;
            int b = x - y;
            int c = x * y;
           int d = x / y;
            // In ra kết quả các phép toán
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x % y = " + d);
        } catch (Exception e) {
            // Nếu xảy ra ngoại lệ, in ra thông báo lỗi
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
//        getMessage() là một phương thức có sẵn trong lớp Throwable của Java, được sử dụng để lấy thông báo lỗi (error message) liên quan đến đối tượng Throwable đang xử lý.
    }
}