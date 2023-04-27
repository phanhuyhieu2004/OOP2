package bai1;

 class Cirle {
    private double banKinh;
    private String mauSac;

    public Cirle(){
        this.banKinh=1.0;
        this.mauSac ="Blue";
    }
    public Cirle(double banKinh , String color){
        this.banKinh=banKinh;
        this.mauSac =color;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String toString(){
        return " Bán kính của hình tròn : "
                +getBanKinh()
                +" Màu sắc của hình tròn : "
                +getMauSac();
    }

}
class CirleTest{
    public static void main(String[] args) {
       Cirle bt1_cirle = new Cirle();
        System.out.println(bt1_cirle);
        bt1_cirle = new Cirle(2.0,"Red");
        System.out.println(bt1_cirle);
    }

}
class Cylinder extends Cirle{
    private double chieuCao;

    public Cylinder(){
        super();
        this.chieuCao = 1.0;
    }
    public Cylinder(double chieuCao){
        this.chieuCao=chieuCao;
    }
    public Cylinder(double banKinh, String mauSac , double chieuCao){
        super(banKinh,mauSac);
        this.chieuCao=chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "Chiều cao của hình trụ là :"
                + getChieuCao()
                + ", và là con của "
                + super.toString();
    }
}
class CylinderTest{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0,"Black",3);
        System.out.println(cylinder);

    }

}