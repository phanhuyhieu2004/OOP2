package bai4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien(String maSV, String tenSV, double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public String toString() {
        return "SinhVien [maSV=" + maSV + ", tenSV=" + tenSV + ", diemToan=" + diemToan + ", diemLy=" + diemLy
                + ", diemHoa=" + diemHoa + "]";
    }

    public static boolean luuSVVaoFile(SinhVien sv, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(sv.getMaSV() + "," + sv.getTenSV() + "," + sv.getDiemToan() + "," + sv.getDiemLy() + ","
                    + sv.getDiemHoa() + "\n");
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<SinhVien> docDanhSachSVTuFile(String fileName) {
        ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
        try {
            FileReader reader = new FileReader(fileName);
            StringBuilder sb = new StringBuilder();
            int c = reader.read();
            while (c != -1) {
                if (c == '\n') {
                    String[] parts = sb.toString().split(",");
                    String maSV = parts[0];
                    String tenSV = parts[1];
                    double diemToan = Double.parseDouble(parts[2]);
                    double diemLy = Double.parseDouble(parts[3]);
                    double diemHoa = Double.parseDouble(parts[4]);
                    SinhVien sv = new SinhVien(maSV, tenSV, diemToan, diemLy, diemHoa);
                    dsSV.add(sv);
                    sb = new StringBuilder();
                } else {
                    sb.append((char) c);
                }
                c = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        if (dsSV.isEmpty()) {
            return null;
        } else {
            return dsSV;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
        while (true) {
            System.out.println("Chon chuc nang:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Luu danh sach sinh vien vao file");
            System.out.println("4. Doc danh sach sinh vien tu file");
            System.out.println("5. Thoat");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ma sinh vien:");
                    String maSV = scanner.nextLine();
                    System.out.println("Nhap ten sinh vien:");
                    String tenSV = scanner.nextLine();
                    System.out.println("Nhap diem toan:");
                    double diemToan = scanner.nextDouble();
                    System.out.println("Nhap diem ly:");
                    double diemLy = scanner.nextDouble();
                    System.out.println("Nhap diem hoa:");
                    double diemHoa = scanner.nextDouble();
                    SinhVien sv = new SinhVien(maSV, tenSV, diemToan, diemLy, diemHoa);
                    dsSV.add(sv);
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien:");
                    for (SinhVien s : dsSV) {
                        System.out.println(s.toString());
                    }
                    break;
                case 3:
                    System.out.println("Nhap ten file luu:");
                    String fileName1 = scanner.nextLine();
                    for (SinhVien s : dsSV) {
                        luuSVVaoFile(s, fileName1);
                    }
                    System.out.println("Luu thanh cong");
                    break;
                case 4:
                    System.out.println("Nhap ten file doc:");
                    String fileName2 = scanner.nextLine();
                    ArrayList<SinhVien> dsSVFromFile = docDanhSachSVTuFile(fileName2);
                    if (dsSVFromFile == null) {
                        System.out.println("File khong ton tai hoac khong co sinh vien trong file");
                    } else {
                        System.out.println("Danh sach sinh vien trong file:");
                        for (SinhVien s : dsSVFromFile) {
                            System.out.println(s.toString());
                        }
                    }
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Nhap sai, moi nhap lai");
                    break;
            }
        }
    }
}

