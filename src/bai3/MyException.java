package bai3;

public class MyException extends Exception {
    public MyException(String s) {
        // Gọi hàm tạo của Ngoại lệ cha
        super(s);
    }
}
    // Một lớp sử dụng MyException ở trên
     class main {
        // Chương trình điều khiển
        public static void main(String args[]) {
            try {
                // Ném một đối tượng ngoại lệ do người dùng định nghĩa

                throw new MyException("GeeksGeeks");
            } catch (MyException ex) {
                System.out.println("Caught");

                // In thông báo từ đối tượng MyException

                System.out.println(ex.getMessage());
            }
        }
    }
//    Bước 2
//    Đoạn mã trên gồm hai lớp:
//
//    Lớp MyException: Lớp này đại diện cho ngoại lệ do người dùng tự định nghĩa. Nó là một lớp con của lớp Exception và có một constructor nhận vào một chuỗi thông báo. Trong constructor này, ta gọi constructor của lớp cha Exception để khởi tạo ngoại lệ.
//      Lớp Main: Lớp này chứa phương thức main để thực thi chương trình. Trong phương thức này, ta tạo một đối tượng MyException và ném ngoại lệ này ra bên ngoài. Nếu có ngoại lệ xảy ra, nó được bắt bởi khối catch và thông báo lỗi được in ra màn hình.
//
//     Bước 3:
//    Khi thực thi đoạn mã trên, chương trình sẽ tạo một đối tượng MyException và ném ngoại lệ này ra bên ngoài. Ngoại lệ này sẽ được bắt bởi khối catch và thông báo lỗi "Caught" cùng với chuỗi thông báo "GeeksGeeks" sẽ được in ra màn hình. Điều này xảy ra vì thông báo lỗi được truyền vào constructor của đối tượng MyException và được lấy ra bằng phương thức getMessage() trong khối catch.


