package bai3;

import java.util.Scanner;

//Đoạn mã lệnh trên có chức năng đọc một số nguyên từ bàn phím, kiểm tra xem số đó có phải là ước của 99 hay không và in ra thông báo tương ứng. Nếu trong quá trình đọc số từ bàn phím hoặc kiểm tra tính đúng đắn phát sinh lỗi, các khối catch sẽ bắt và xử lý lỗi tương ứng.
//Ư(99)={1;3;9;11;33;99}
//public class Test
//{
// Bước 1
//    public static void main(String args[])
//    {
//        Scanner scn = new Scanner(System.in);
// Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím.
//        try
//        {
//            int n = Integer.parseInt(scn.nextLine());
// Phương thức Integer.parseInt(s) nhận vào một chuỗi s và chuyển đổi nó thành một số nguyên. Nếu chuỗi không thể được chuyển đổi thành một số nguyên hợp lệ, phương thức sẽ phát sinh ra một ngoại lệ NumberFormatException.
//
//  Phương thức Scanner.nextInt() đọc một số nguyên từ đầu vào (ví dụ như từ bàn phím). Nếu đầu vào không phải là một số nguyên hợp lệ, phương thức sẽ phát sinh ra một ngoại lệ InputMismatchException.
//   Đọc một dòng dữ liệu từ bàn phím và chuyển đổi thành một số nguyên bằng cách sử dụng phương thức parseInt() của lớp Integer. Giá trị số nguyên này được lưu trữ trong biến n.
//            if (99%n == 0)
//                System.out.println(n + " is a factor of 99");
//            Kiểm tra xem số n có phải là ước của 99 hay không bằng cách kiểm tra xem 99 chia hết cho n hay không. Nếu có, in ra thông báo "n is a factor of 99".
//        }
//        catch (ArithmeticException ex)
//        {
//            System.out.println("Arithmetic " + ex);
//        }
//        catch (NumberFormatException ex)
//        {
//            System.out.println("Number Format Exception " + ex);
//        }
//   Nếu phát sinh lỗi trong quá trình đọc dữ liệu từ bàn phím hoặc kiểm tra tính đúng đắn, các khối catch sẽ bắt và xử lý lỗi tương ứng. Nếu lỗi là ArithmeticException, in ra thông báo "Arithmetic" cùng với thông tin chi tiết về lỗi. Nếu lỗi là NumberFormatException, in ra thông báo "Number Format Exception" cùng với thông tin chi tiết về lỗi.
//    }
//}
//Bước 2:
//  Đoạn mã lệnh trên có hai khối `catch()`. Mục đích của mỗi khối `catch()` là bắt và xử lý các ngoại lệ tương ứng với loại lỗi phát sinh trong khối `try`.
//
//  Khối `catch(ArithmeticException ex)` bắt và xử lý ngoại lệ `ArithmeticException`, xảy ra khi một phép tính toán số học không hợp lệ được thực hiện, ví dụ như chia một số cho 0. Mục đích của khối `catch(ArithmeticException ex)` là hiển thị một thông báo lỗi liên quan đến lỗi tính toán số học.
//
//  Khối `catch(NumberFormatException ex)` bắt và xử lý ngoại lệ `NumberFormatException`, xảy ra khi một chuỗi không thể chuyển đổi sang một số nguyên hợp lệ bằng phương thức `Integer.parseInt()`. Mục đích của khối `catch(NumberFormatException ex)` là hiển thị một thông báo lỗi liên quan đến việc nhập sai định dạng số.
//
//  Cả hai khối `catch()` đều có mục đích giúp xử lý các ngoại lệ trong chương trình một cách chính xác và tránh cho chương trình bị dừng đột ngột bởi những ngoại lệ không mong muốn. Mỗi khối `catch()` sử dụng một đối tượng tham số khác nhau để đại diện cho ngoại lệ tương ứng và thực hiện các xử lý tương ứng với loại ngoại lệ đó.
//
//
//Bước 3:
//  Khi nhập "GeeksforGeeks" từ bàn phím, đoạn mã lệnh sẽ phát sinh lỗi NumberFormatException do không thể chuyển đổi chuỗi "GeeksforGeeks" sang một số nguyên hợp lệ. Do đó, khối catch NumberFormatException sẽ được thực thi và thông báo "Number Format Exception" cùng với thông tin chi tiết về lỗi sẽ được in ra trên màn hình.
//Bước 4:
// Khi nhập số 0 từ bàn phím, đoạn mã lệnh sẽ phát sinh lỗi ArithmeticException do phép chia 99/0 là không hợp lệ. Do đó, khối catch ArithmeticException sẽ được thực thi và thông báo "Arithmetic" cùng với thông tin chi tiết về lỗi sẽ được in ra trên màn hình.
public class Test
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());
            if (99%n == 0)
                System.out.println(n + " hệ số thực của 99");
        }
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception encountered" + ex);
        }
    }
}

//Khi thực thi đoạn mã trên với đầu vào là chuỗi "GeeksforGeeks", nó sẽ phát sinh ra một ngoại lệ NumberFormatException vì chuỗi này không thể chuyển đổi thành một số nguyên hợp lệ bằng phương thức Integer.parseInt(). Do đó, chương trình sẽ thực hiện khối catch(NumberFormatException ex) và in ra thông báo lỗi "Gặp phải ngoại lệ java.lang.NumberFormatException".
//
//        Khi thực thi đoạn mã trên với đầu vào là số 0, nó sẽ phát sinh ra một ngoại lệ ArithmeticException vì phép tính 99%n không hợp lệ khi n=0. Do đó, chương trình sẽ thực hiện khối catch(ArithmeticException ex) và in ra thông báo lỗi "Gặp phải ngoại lệ java.lang.ArithmeticException".
//
//        Trong cả hai trường hợp, chương trình sẽ không thực hiện lệnh in ra "n hệ số của 99" vì điều kiện kiểm tra if (99%n == 0) không được thỏa mãn.

