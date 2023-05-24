package bai6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Account {

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
//    Khai báo biểu thức chính quy để kiểm tra tài khoản. Biểu thức này chỉ cho phép các ký tự thường, số và dấu gạch dưới, và yêu cầu tài khoản có độ dài ít nhất là 6 ký tự.

    public Account() {
    }


    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
//    Phương thức validate kiểm tra xem tài khoản được truyền vào có hợp lệ hay không. Nó tạo ra một đối tượng Pattern từ biểu thức chính quy, sau đó sử dụng nó để tạo ra một đối tượng Matcher và so khớp với chuỗi đầu vào. Phương thức trả về true nếu chuỗi đầu vào khớp với biểu thức chính quy và false nếu không khớp.
 class AccountTest {

    private static Account account;
//    Khai báo hai mảng các chuỗi đầu vào: validAccount chứa các chuỗi đầu vào hợp lệ và invalidAccount chứa các chuỗiđầu vào không hợp lệ.

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        account = new Account();
//        Vòng lặp for để kiểm tra các chuỗi đầu vào hợp lệ. Với mỗi chuỗi, phương thức validate của lớp Account được gọi để kiểm tra xem nó có hợp lệ hay không. Kết quả được in ra màn hình.
        for (String accountStr : validAccount) {
            boolean isValid = account.validate(accountStr);
            System.out.println("Tài khoản là " + accountStr +" là hợp lệ: "+ isValid);
        }
//        Vòng lặp for để kiểm tra các chuỗi đầu vào không hợp lệ. Tương tự như vòng lặp trước, phương thức validate được gọi để kiểm tra và kết quả được in ra màn hình.
        for (String accountStr : invalidAccount) {
            boolean isValid = account.validate(accountStr);
            System.out.println("Tài khoản là " + accountStr +" là hợp lệ: "+ isValid);
        }
    }
}