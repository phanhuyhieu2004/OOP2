package Test;

import java.io.Serializable;

public abstract class SinhVien implements DiHoc, Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    private String ten;

    public SinhVien(int id, String name) {
        this.id = id;
        this.ten = ten;
    }

    @Override
    public void diHoc() {
        System.out.println("Đi học");
    }

    @Override
    public boolean dongTien(int soTien) {
        if (soTien >= 1000000) {
            System.out.println("Đã đóng tiền học phí");
            return true;
        } else {
            System.out.println("Số tiền không đủ để đóng tiền học phí");
            return false;
        }
    }
    public abstract void hoc();
}



