package test.assignment07.Exercise1Static.entity;

public abstract class HinhHoc {
    protected static int counter = 0;

    public HinhHoc() {
        if (counter >= Configs.SO_LUONG_TOI_DA)
            throw new HinhHocException("Vượt quá " + Configs.SO_LUONG_TOI_DA);
        counter++;
        System.out.println(this.display());
    }

    abstract double tinhChuVi();
    abstract double tinhDienTich();

    public String display() {
        return "HinhHoc{" +
                "counter=" + counter +
                " " + this.toString() +
                "}";
    }
}
