package bai3;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom() {
        // Tạo một đối tượng Random
        Random rd = new Random();
        // Tạo một mảng có 100 phần tử
       int[] arr = new int[100];
        // In danh sách các phần tử trong mảng
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            // Tạo một số nguyên ngẫu nhiên và gán vào mảng
            arr[i] = rd.nextInt(100);
            // In giá trị của phần tử đó ra màn hình
            System.out.print(arr[i]+ " ");
        }
        // Trả về mảng đã tạo
        return arr;
    }
}
//    lớp ArrayExample có một phương thức createRandom() để tạo một mảng gồm 100 số nguyên ngẫu nhiên và in ra danh sách các phần tử trong mảng đó. Phương thức này sử dụng lớp Random để tạo số ngẫu nhiên và trả về mảng đã tạo.

class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng ArrayExample
        ArrayExample arrExample = new ArrayExample();
        // Tạo một mảng ngẫu nhiên bằng cách gọi phương thức createRandom() của lớp ArrayExample
        int[] arr = arrExample.createRandom();

        // Yêu cầu người dùng nhập chỉ số của một phần tử trong mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();

        try {
            // In ra giá trị của phần tử tại chỉ số được nhập vào
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            // Nếu chỉ số vượt quá giới hạn của mảng, in ra thông báo lỗi
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }
}
//    Lớp Main có phương thức main() là điểm bắt đầu để thực thi chương trình. Trong phương thức main(), đầu tiên chúng ta tạo một đối tượng ArrayExample và gọi phương thức createRandom() để tạo một mảng ngẫu nhiên. Sau đó, chương trình yêu cầu người dùng nhập chỉ số của một phần tử trong mảng và sử dụng câu lệnh scanner.nextInt() để đọc giá trị được nhập vào.
//        Tiếp theo, chúng ta sử dụng câu lệnh arr[x] để lấy giá trị của phần tử có chỉ số x trong mảng arr, và in giá trị đó ra màn hình. Nếu chỉ số x vượt quá giới hạn của mảng, chương trình sẽ ném ra một ngoại lệ IndexOutOfBoundsException, và chúng ta bắt ngoại lệ đó bằng cách sử dụng câu lệnh catch để in ra thông báo lỗi "Chỉ số vượt quá giới hạn của mảng".