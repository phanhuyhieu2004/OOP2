package bai3;

public class GFG3 {
    public static void main(String[] args) {
        // Khởi tạo biến String với giá trị null
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0, 5);
        System.out.println(message);

        // Khởi tạo biến String với giá trị null
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);
    }
}
//Bước 1: Khi chạy đoạn mã lệnh trên, kết quả sẽ được in ra màn hình. Đầu tiên, biến str được khởi tạo với giá trị null. Sau đó, biến message được khởi tạo bằng cách kiểm tra xem biến str có giá trị null hay không. Nếu có, message được gán giá trị "", ngược lại, message được gán giá trị của chuỗi con từ vị trí đầu tiên đến vị trí thứ 5 của biến str. Vì str có giá trị null, biến message sẽ được gán giá trị "", và kết quả sẽ được in ra màn hình là một dòng trống.
//
//        Sau đó, biến str được gán giá trị "Geeksforgeeks", và lại kiểm tra giá trị của biến str. Lần này, str có giá trị khác null, và biến message được gán giá trị chuỗi con từ vị trí đầu tiên đến vị trí thứ 5 của str. Kết quả sẽ được in ra màn hình là "Geeks".
//Bước 2: Cú pháp tổng quát của toán tử 3 ngôi là:
//
//<biến kết quả> = <điều kiện> ? <giá trị nếu đúng> : <giá trị nếu sai>;
//
//        Trong đó:
//
//<biến kết quả> là biến lưu giá trị kết quả.
//<điều kiện> là biểu thức kiểm tra điều kiện.
//<giá trị nếu đúng> là giá trị được gán cho biến kết quả nếu điều kiện đúng.
//<giá trị nếu sai> là giá trị được gán cho biến kết quả nếu điều kiện sai.



