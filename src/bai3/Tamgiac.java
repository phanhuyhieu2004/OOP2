package bai3;

import java.util.Scanner;
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {

        super(message);
    }
}
//   Chúng ta định nghĩa lớp IllegalTriangleException để tạo ra ngoại lệ khi các giá trị nhập vào không hợp lệ cho tam giác. Lớp này kế thừa lớp Exception và có một constructor để truyền thông điệp cho ngoại lệ.
public class Tamgiac {
//    Chúng ta khai báo lớp Tamgiac và trong phương thức main() của lớp này, chúng ta sử dụng đối tượng Scanner để nhập giá trị 3 cạnh của tam giác từ bàn phím
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạch của tam giác:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
//        Nhập 3 số bất kì vào thành 3 cạnh của tam  giác

        try {
            kiemTraTamGiac(side1, side2, side3);
            System.out.println("Đây là những cạnh hợp lệ cho một tam giác.\n");
        } catch (IllegalTriangleException e) {
            System.out.println("Đây không phải là các cạnh hợp lệ cho một hình tam giác.\n");
        }
    }

//    Tiếp theo, chúng ta sử dụng lệnh try-catch để xử lý ngoại lệ. Chúng ta gọi phương thức kiemTraTamGiac() để kiểm tra xem các giá trị nhập vào có hợp lệ cho tam giác hay không. Nếu các giá trị không hợp lệ, phương thức này sẽ ném ngoại lệ IllegalTriangleException. Chúng ta bắt ngoại lệ này bằng lệnh catch và in ra thông báo tương ứng.

    public static void kiemTraTamGiac(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh không được âm hoặc 0\n.");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh thứ ba.\n");
        }
    }
}
//    Trong phương thức kiemTraTamGiac(), chúng ta kiểm tra xem các giá trị nhập vào có hợp lệ cho tam giác hay không. Nếu các giá trị không hợp lệ, chúng ta ném ngoại lệ IllegalTriangleException với thông điệp phù hợp.



