package bai3;

public class GFG2 {
    //    Chương trình trên có chức năng so sánh giá trị của biến ptr với chuỗi "gfg". Tuy nhiên, đoạn mã gặp lỗi khi biến ptr có giá trị null, và phương thức equals() không thể được gọi trên một biến có giá trị null.
//    public static void main (String[] args)
//        {
//            String ptr = null;
//            Khai báo biến ptr và gán giá trị null cho nó.
//            if (ptr.equals("gfg"))
//                System.out.print("giống");
//            else
//                System.out.print("Không giống");
//            Sử dụng cấu trúc điều kiện if-else để kiểm tra giá trị của biến ptr. Nếu biến ptr có giá trị "gfg", chương trình sẽ in ra chuỗi "Same". Ngược lại, nếu biến ptr có giá trị khác "gfg", chương trình sẽ in ra chuỗi "Not Same".
//        }
//    }
//    Tuy nhiên, khi biến ptr có giá trị null, phương thức equals() không thể được gọi trên nó, và chương trình sẽ gặp lỗi NullPointerException. Để khắc phục lỗi này, cần kiểm tra xem biến ptr có giá trị null hay không trước khi gọi phương thức equals().
//Bước 1: Khi chạy đoạn mã lệnh trên, một ngoại lệ NullPointerException sẽ được ném ra vì biến ptr được khởi tạo với giá trị null, và phương thức equals() không thể được gọi trên một biến có giá trị null.
//    public static void main(String[] args) {
// Khởi tạo biến String với giá trị null
//        String ptr = null;

    // Kiểm tra xem ptr.equals null hay hoạt động tốt.
//        try {

// Dòng mã này ném NullPulumException
    // vì ptr là null
//            if (ptr.equals("gfg"))
//                System.out.print("giống");
//            else
//                System.out.print("không giống");
//        } catch (NullPointerException e) {
//            System.out.print("NullPointerException bắt được");
//        }
//    }
//}
//Bước 2: Khi chạy đoạn mã lệnh đã chỉnh sửa, một ngoại lệ NullPointerException sẽ được bắt và in ra thông báo "NullPointerException Caught". Đoạn mã đã được bọc trong một khối try-catch, trong đó ngoại lệ NullPointerException được bắt và xử lý.
//Bước 3: Ngoại lệ NullPointerException xảy ra khi một phương thức được gọi trên một biến có giá trị null.
public static void main (String[] args)
{
    // Khởi tạo biến String với giá trị null
    String ptr = null;

    // Kiểm tra xem ptr có null hay không bằng try catch..
    try
    {
        if ("gfg".equals(ptr))
            System.out.print("giống");
        else
            System.out.print("không giống");
    }
    catch(NullPointerException e)
    {
        System.out.print("Caught NullPointerException");
    }
}
//    Bước 4: Khi chạy đoạn mã lệnh đã chỉnh sửa lần 2, kết quả sẽ được in ra là "Not Same". Thay vì gọi phương thức equals() trên biến ptr, đoạn mã đã đảo ngược vị trí của "gfg" và ptr và gọi phương thức equals() trên chuỗi "gfg". Do đó, khi biến ptr có giá trị null, không có phương thức nào được gọi trên biến ptr, và không có ngoại lệ xảy ra. Thay vào đó, chuỗi "gfg" là người được gọi phương thức equals(), và phương thức này trả về false vì hai chuỗi không giống nhau.


}


