package bai4;


import java.io.File;
import java.util.Scanner;

public class LayThongTinVaDuyetThuMuc {
    File file;

    public LayThongTinVaDuyetThuMuc(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi() {
//        Kiểm tra file có thể thực thi
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
        return this.file.canExecute();

    }

    public boolean kiemTraGhi() {
        return this.file.canWrite();
    }

    public void inDuongDan() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void intenFile() {
        System.out.println(this.file.getName());
    }

    public void kiemTraLaThuMuchoăcTapTin() {
        if (this.file.isDirectory()) {
            System.out.println("Đây là thư mục");
        } else if (this.file.isFile())
            System.out.println("Đây là tập tin");
    }

    public void inDanhSachCacFileCon() {
        if (this.file.isDirectory()) {
            System.out.println("Các tập tin con/thư mục con là ");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsolutePath());
            }

        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin không thể có file con");

        }
    }

    public void inCayThuMuc() {
this.inChiTietCayThưMuc(this.file,1);
    }

    public void inChiTietCayThưMuc(File f, int bac) {
        for (int i = 0; i < bac; i++) {
            System.out.println("\t");
        }
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietCayThưMuc(f, bac + 1);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int luaChon=0;
        System.out.println("Nhập tên file");
        String tenFile=sc.nextLine();
        LayThongTinVaDuyetThuMuc layThongTinVaDuyetThuMuc=new LayThongTinVaDuyetThuMuc(tenFile);


        do {
            System.out.println("MENU--------------");
            System.out.println("1.Kiểm tra file có thể thực thi :");
            System.out.println("2.Kiểm tra file có thể đọc : ");
            System.out.println("3.Kiểm tra file có thể ghi : ");
            System.out.println("4.In đường dẫn");
            System.out.println("5.In tên file");
            System.out.println("6.Kiểm tra file là thư mục/tập tin :");
            System.out.println("7.inDanhSachCacFileCon ");
            System.out.println("8.In ra cây thư mục:");
            System.out.println("0.Thoát chương trình:");
            luaChon= sc.nextInt();
            switch (luaChon){
                case 1:
                    System.out.println(layThongTinVaDuyetThuMuc.kiemTraThucThi());
                    break;
                    case 2:
                    System.out.println(layThongTinVaDuyetThuMuc.kiemTraDoc());
                    break;
                    case 3:
                    System.out.println(layThongTinVaDuyetThuMuc.kiemTraGhi());
                    break;
                case 4:
layThongTinVaDuyetThuMuc.inDuongDan();
break;
                case 5:
                    layThongTinVaDuyetThuMuc.intenFile();
                    break;
                case 6:
                    layThongTinVaDuyetThuMuc.kiemTraLaThuMuchoăcTapTin();
                    break;
                case 7:
                    layThongTinVaDuyetThuMuc.inDanhSachCacFileCon();
                    break;
                case 8:
                    layThongTinVaDuyetThuMuc.inCayThuMuc();
                    break;
                default:
                    break;
            }
            sc.nextLine();

        }while (luaChon!=0);
    }

}
