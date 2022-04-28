package baiitoanquanlyphonghoc;

import java.util.Scanner;

public abstract class PhongHoc {

    protected String maPhong;
    protected String dayNha;
    protected float dienTich;
    protected int soBongDen;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) throws Exception {
        if (dienTich < 0) {
            throw new Exception("dien tich nho hon khong");
        }
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) throws Exception {
        if (soBongDen < 0) {
            throw new Exception("so bong den nho hon khong");
        }
        this.soBongDen = soBongDen;
    }

    public PhongHoc() {
    }

    public PhongHoc(String maPhong, String dayNha, float dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public abstract Boolean checkStandard();

    public void nhap() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma phong: ");

        setMaPhong(sc.nextLine());

        System.out.println("Nhap day nha: ");
        setDayNha(sc.nextLine());
        System.out.println("Nhap dien tich: ");
        setDienTich(sc.nextFloat());
        System.out.println("Nhap so bong den: ");
        setSoBongDen(sc.nextInt());

    }

    @Override
    public String toString() {
        return "PhongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + '}';
    }

}
