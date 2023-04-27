package bai3;


class GFG {
    public static void main(String[] args) {
// String s thiết lập một chuỗi rỗng và gọi hàm getLength()
//        Trong phương thức main(), chúng ta khởi tạo một chuỗi rỗng s và gọi phương thức getLength() để lấy độ dài của chuỗi đó bằng cách truyền chuỗi s vào phương thức. Chúng ta đặt lệnh này trong khối try-catch để bắt ngoại lệ IllegalArgumentException nếu có.
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException bắt được");
        }

// Chuỗi s được đặt thành một giá trị và gọi hàm getLength()
//        Tiếp theo, chúng ta đặt giá trị của chuỗi s thành "GeeksforGeeks" và gọi phương thức getLength() để lấy độ dài của chuỗi đó. Chúng ta đặt lệnh này trong khối try-catch để bắt ngoại lệ IllegalArgumentException nếu có.
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException bắt được");
        }

// Đặt s là null và gọi getLength()
//        Cuối cùng, chúng ta đặt giá trị của chuỗi s thành null và gọi phương thức getLength() để lấy độ dài của chuỗi đó. Chúng ta đặt lệnh này trong khối try-catch để bắt ngoại lệ IllegalArgumentException nếu có.
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException bắt được");
        }
    }

    // Hàm trả về độ dài của chuỗi s. Nó ném
    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("Đối số không thể là null");
        return s.length();
    }
//    Phương thức getLength() được định nghĩa để trả về độ dài của chuỗi đầu vào s. Tuy nhiên, trước khi trả về độ dài, phương thức kiểm tra xem đối số đầu vào s có phải là null hay không. Nếu s là null, phương thức sẽ ném một ngoại lệ IllegalArgumentException với thông báo lỗi "Đối số không thể là null".
}
//    Tóm lại, đoạn mã trên là cách sử dụng ngoại lệ IllegalArgumentException để xử lý trường hợp đối số đầu vào là null trong phương thức getLength().
//Bước 2: Hàm getLength() được sử dụng để trả về độ dài của một chuỗi đầu vào s. Trước khi trả về độ dài, hàm kiểm tra xem đối số đầu vào s có phải là null hay không. Nếu s là null, hàm sẽ ném một ngoại lệ IllegalArgumentException với thông báo lỗi "Đối số không thể là null".
//
// Bước 3: Kết quả in ra của chương trình sẽ là:
//
//        0
//         in ra kết quả của hàm getLength() với đối số là chuỗi rỗng (""). Vì chuỗi rỗng không có ký tự nào, nên độ dài của nó là 0.
//        13
//         in ra kết quả của hàm getLength() với đối số là chuỗi "GeeksforGeeks". Chuỗi này có 11 ký tự, nên độ dài của nó là 11.
//        IllegalArgumentException bắt được
//        gây ra một ngoại lệ IllegalArgumentException, vì đối số đầu vào là null.
//        Giải thích:
////
//   Bước 4: Ngoại lệ IllegalArgumentException xảy ra khi đối số đầu vào của một phương thức không hợp lệ. Trong trường hợp này, hàm getLength() kiểm tra xem đối số đầu vào s có phải là null hay không. Nếu s là null, hàm sẽ ném một ngoại lệ IllegalArgumentException.

// IllegalArgumentException nếu s là null.

