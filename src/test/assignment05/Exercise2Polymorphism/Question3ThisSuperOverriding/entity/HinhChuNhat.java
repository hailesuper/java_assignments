package test.assignment05.Exercise2Polymorphism.Question3ThisSuperOverriding.entity;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void tinhChuVi() {
        double chuVi = (chieuDai + chieuRong) * 2;
        System.out.printf("Chu vi %.2f (theo hình chữ nhật)\n", chuVi);
    }

    public void tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        System.out.printf("Diện tích %.2f (theo hình chữ nhật)\n", dienTich);
    }
}
