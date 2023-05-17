package bai5;

import java.io.*;
import java.util.ArrayList;

public class Product implements Serializable {
    private String proID;
    private String proName;
    private double price;

    public Product() {
    }

    public Product(String proID, String proName, double price) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proID='" + proID + '\'' +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
 class ProductProcess {
    public static boolean writeObjectData(Product objProduct, String fileName) {
        try {
            // Tạo đối tượng ObjectOutputStream để ghi đối tượng vào file
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            // Ghi đối tượng vào file
            objectOutputStream.writeObject(objProduct);
            // Đóng ObjectOutputStream
            objectOutputStream.close();
            // Trả về true nếu ghi thành công
            return true;
        } catch (IOException e) {
            // Nếu có lỗi, in ra thông báo lỗi và trả về false
            System.out.println("Lỗi khi ghi đối tượng vào file: " + e.getMessage());
            return false;
        }
    }

    public static Product[] readObjectData(String fileName) {
        try {
            // Tạo đối tượng ObjectInputStream để đọc đối tượng từ file
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            // Tạo một ArrayList để lưu các đối tượng đọc được từ file
            ArrayList<Product> productList = new ArrayList<>();
            // Đọc các đối tượng từ file cho đến khi kết thúc file
            while (true) {
                try {
                    Product product = (Product) objectInputStream.readObject();
                    productList.add(product);
                } catch (EOFException e) {
                    // Kết thúc file, thoát khỏi vòng lặp
                    break;
                }
            }
            // Đóng ObjectInputStream
            objectInputStream.close();
            // Nếu có ít nhất một đối tượng được đọc thành công từ file, trả về mảng đối tượng
            if (productList.size() > 0) {
                return productList.toArray(new Product[0]);
            } else {
                // Ngược lại, trả về null
                return null;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Nếu có lỗi, in ra thông báo lỗi và trả về null
            System.out.println("Lỗi khi đọc đối tượng từ file: " + e.getMessage());
            return null;
        }
    }
}
//     Lớp ProductProcess có hai phương thức để ghi và đọc đối tượng từ file. Phương thức writeObjectData ghi một đối tượng Product vào file và trả về true nếu việc ghi thành công, ngược lại trả về false. Phương thức readObjectData đọc một đối tượng từ file và trả về một mảng đối tượng Product. Nếu mảng đối tượng là null tức là file không có dữ liệu hoặc có lỗi.
 class ProductApp {
    public static void main(String[] args) {
        // Tạo đối tượng objProduct1 với phương thức khởi tạo không tham số
        Product objProduct1 = new Product();
        // Thiết đặt giá trị cho các thuộc tính của đối tượng objProduct1 bằng phương thức setter
        objProduct1.setProID("P001");
        objProduct1.setProName("Product 1");
        objProduct1.setPrice(10000);

        // Tạo đối tượng objProduct2 với phương thức khởi tạo 3 tham số
        Product objProduct2 = new Product("P002", "Product 2", 20000);

        // Đặt tên file là "object.dat"
        String fileName = "object.dat";

        // Ghi đối tượng objProduct1 vào file
        if (ProductProcess.writeObjectData(objProduct1, fileName)) {
            System.out.println("Ghi đối tượng objProduct1 vào file thành công");
        } else {
            System.out.println("Ghi đối tượng objProduct1 vào file không thành công");
        }

        // Ghi đối tượng objProduct2 vào file
        if (ProductProcess.writeObjectData(objProduct2, fileName)) {
            System.out.println("Ghi đối tượng objProduct2 vào file thành công");
        } else {
            System.out.println("Ghi đối tượng objProduct2 vào file không thành công");
        }

        // Đọc các đối tượng từ file và lưu vào mảng đối tượng
        Product[] products = ProductProcess.readObjectData(fileName);

        // Nếu mảng đối tượng không phải là null, hiển thị thông tin các đối tượng
        if (products != null) {
            for (Product product : products) {
                System.out.println(product.toString());
            }
        } else {
            System.out.println("File không có dữ liệu hoặc có lỗi");
        }
    }
}
//    Lớp ProductApp là lớp thực thi chứa hàm main(). Trong hàm main(), ta tạo hai đối tượng Product và ghi chúng vào file bằng phương thức writeObjectData của lớp ProductProcess. Sau đó, ta đọc các đối tượng từ file bằng phương thức readObjectData của lớp ProductProcess và hiển thị thông tin các đối tượng đọc được.