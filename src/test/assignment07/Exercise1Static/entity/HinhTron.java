package test.assignment07.Exercise1Static.entity;

public class HinhTron extends HinhHoc {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    double tinhChuVi() {
        return banKinh * 2 * Math.PI;
    }

    @Override
    double tinhDienTich() {
        return Math.sqrt(banKinh) * Math.PI;
    }
}
