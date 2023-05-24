package bai6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email{
    private static Pattern pattern;
    // pattern lưu trữ BTCQ kiểm tra tính hợp lệ của địa chỉ email
    private Matcher matcher;
//    matcher  lưu trữ kết quả so khớp giữa chuỗi địa chỉ email và BTCQ
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//    BTCQ kiểm tra tính hợp lệ của địa chỉ email
    public Email() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
//    Hàm khởi tạo của lớp Email, sử dụng BTCQ để tạo đối tượng Pattern
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
// Phương thức validate để kiểm tra tính hợp lệ của một chuỗi địa chỉ email


class EmailTest {
    private static Email email;
    // Mảng validEmail chứa các địa chỉ email hợp lệ để kiểm tra
    public static final String[] validEmail = new String[] { "x@gmail.com", "xy@yahoo.com", "xyz@hotmail.com" };
    // Mảng invalidEmail chứa các địa chỉ email không hợp lệ để kiểm tra
    public static final String[] invalidEmail = new String[] { "@gmail.com", "xy@gmail.", "@#xyz@gmail.com" };
//    kiểm tra tính hợp lệ của các địa chỉ email bằng cách sử dụng đối tượng Email và phương thức validate.
    public static void main(String args[]) {
        email = new Email();
//        Tạo một đối tượng mới của lớp Email
        // Kiểm tra tính hợp lệ của từng địa chỉ email trong mảng validEmail
        for (String emailAdd : validEmail) {
//            Duyệt qua từng phần tử trong mảng validEmail . Mỗi phần tử được lưu trữ trong biến emailAdd.
            boolean isvalid = email.validate(emailAdd);
//            Gọi phương thức validate của đối tượng Email để kiểm tra tính hợp lệ của địa chỉ email emailAdd. Kết quả này được lưu trữ trong biến isvalid.
            System.out.println("Email là " + emailAdd +" là hợp lệ: "+ isvalid);
        }
        // Kiểm tra tính hợp lệ của từng địa chỉ email trong mảng invalidEmail
        for (String emailAdd : invalidEmail) {
            boolean isvalid = email.validate(emailAdd);
            System.out.println("Email là " + emailAdd +" là hợp lệ: "+ isvalid);
        }
    }
}