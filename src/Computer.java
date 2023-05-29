import java.io.FileWriter;
import java.io.IOException;

public class Computer {
    private String code;
    private String name;
private String hangSanXuat;
    private String cauhinh;
    private double gia;
    private String trangThai;
    public Computer(String code, String name, String hangSanXuat, String cauhinh, double gia, String trangThai) {
        this.code = code;
        this.name = name;
        this.hangSanXuat = hangSanXuat;
        this.cauhinh = cauhinh;
        this.gia = gia;
        this.trangThai = trangThai;
    }
    public Computer(){
Computer[] Arraycomputer= new Computer[0];}


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getCauhinh() {
        return cauhinh;
    }

    public void setCauhinh(String cauhinh) {
        this.cauhinh = cauhinh;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", cauhinh='" + cauhinh + '\'' +
                ", gia=" + gia +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }


//    public static void addComputerToArray(Computer computer,String fileName){
//       try{
//
//       }
//        catch (IOException e) {
//           throw new RuntimeException(e);
//       }


    }
}
