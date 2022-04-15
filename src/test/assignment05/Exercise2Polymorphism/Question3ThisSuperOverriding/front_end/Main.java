package test.assignment05.Exercise2Polymorphism.Question3ThisSuperOverriding.front_end;

import test.assignment05.Exercise2Polymorphism.Question3ThisSuperOverriding.entity.HinhVuong;

public class Main {
    public static void main(String[] args) {
        var hinhVuong = new HinhVuong(3.5);
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
    }
}
