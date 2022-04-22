package test.assignment07.Exercise1Static.entity;

public class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
