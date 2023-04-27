package bai3;

class ThrowExcep {
    static void fun(){
//    Định nghĩa phương thức tĩnh fun()
        try
        {
            throw new NullPointerException("demo");
//            : Bắt đầu khối try-catch trong phương thức fun(). Dòng 4 tạo một ngoại lệ NullPointerException với thông điệp "demo" và ném ngoại lệ đó.
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
//            Khi ngoại lệ NullPointerException được ném, nó được bắt bởi khối catch và in ra thông báo "Caught inside fun()". Sau đó, ngoại lệ được ném lại bằng lệnh throw e;.
        }
    }

    public static void main(String args[])
//    Định nghĩa phương thức tĩnh main(). Phương thức này gọi phương thức fun() bên trong khối try và bắt ngoại lệ NullPointerException được ném lại từ fun() bên trong khối catch.
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
//            Khi ngoại lệ NullPointerException được ném lại từ fun() và bắt bởi khối catch trong main(), nó in ra thông báo "Caught in main()".
        }
    }
}
//    Khi ngoại lệ NullPointerException được ném lại từ fun() và bắt bởi khối catch trong main(), nó in ra thông báo "Caught in main()".
//Bước 2: Lệnh throw trong đoạn mã trên được sử dụng để ném một ngoại lệ từ khối catch của phương thức fun() ra bên ngoài, để phương thức gọi fun() có thể bắt ngoại lệ đó.
//
//Bước 3: Lệnh throw new NullPointerException("demo"); được sử dụng để tạo ra một ngoại lệ NullPointerException với thông điệp "demo" và ném ngoại lệ đó ra khỏi phương thức fun().
//
 //Bước 4: Lệnh throw e; được sử dụng để ném lại ngoại lệ NullPointerException đã được bắt và xử lý trong khối catch của phương thức fun(), từ đó đưa ngoại lệ này ra khỏi phương thức fun() để phương thức gọi fun() có thể bắt ngoại lệ đó.
//
//Bước 5: Khi đoạn mã trên được thực thi, kết quả in ra là "Caught in main." vì ngoại lệ NullPointerException đã được ném lại bởi phương thức fun() và được bắt bởi khối catch trong phương thức main(). Sau khi ngoại lệ được bắt, chương trình tiếp tục thực thi và in ra thông báo "Caught in main." để cho biết rằng ngoại lệ đã được xử lý.