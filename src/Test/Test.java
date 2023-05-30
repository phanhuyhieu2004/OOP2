package Test;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien(10);
        SinhVien sv1 = new SinhVien(1, "Nguyen Van A", "CNTT", 8);
        SinhVien sv2 = new SinhVien(2, "Tran Thi B", "KTMT", 7.5f);
        SinhVien sv3 = new SinhVien(3, "Le Van C", "DTVT", 9);

        qlsv.addSinhVien(sv1);
        qlsv.addSinhVien(sv2);
        qlsv.addSinhVien(sv3);

        String fileName = "sinhvien.dat";
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("Tao file thanh cong");
            } else {
                System.out.println("File da ton tai");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (qlsv.writeToFile(fileName)) {
            System.out.println("Ghi file thanh cong");
        } else {
            System.out.println("Ghi file that bai");
        }

        qlsv = new QuanLySinhVien(10);
        if (qlsv.readFromFile(fileName)) {
            System.out.println("Doc file thanh cong");
            qlsv.findSinhVien();
        } else {
            System.out.println("Doc file that bai");
        }
    }
}