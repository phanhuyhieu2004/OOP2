package bai6;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
//    chương trình sẽ gọi phương thức isValidPhoneNumber() để kiểm tra tính hợp lệ của số điện thoại đó.

//    Phương thức isValidPhoneNumber() được sử dụng để kiểm tra tính hợp lệ của số điện thoại. Phương thức này nhận đầu vào là một chuỗi (string) phoneNumber, rồi kiểm tra xem chuỗi đó có phù hợp với một định dạng cụ thể hay không
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
//        Khai báo một biến regex là một chuỗi (string) chứa một biểu thức chính quy (regular expression) để kiểm tra chuỗi số điện thoại có hợp lệ hay không. Biểu thức chính quy này chỉ chấp nhận các số điện thoại có định dạng "(xx)-(0xxxxxxxxx)", trong đó xx là hai chữ số bất kỳ, và xxxxxxxxx là chín chữ số bắt đầu bằng số 0. Dấu ngoặc đơn ( ) và dấu gạch chéo ngược (\) được sử dụng để định dạng đúng chuỗi số điện thoại.
        return phoneNumber.matches(regex);
//        Phương thức matches() của lớp String được sử dụng để kiểm tra xemchuỗi số điện thoại được truyền vào có phù hợp với biểu thức chính quy regex hay không. Nếu chuỗi số điện thoại khớp với biểu thức chính quy, phương thức matches() sẽ trả về true, và ngược lại, nếu không khớp, phương thức matches() sẽ trả về false
    }
}

