/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai3;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class NhanVienSanXuat extends NhanVien {

    private int soSanPham;

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public NhanVienSanXuat() {

    }

    public NhanVienSanXuat(String maNhanVien) {
        super(maNhanVien);
    }

    @Override
    public double tinhLuong() {
        return soSanPham * 100000;
    }

    @Override
    public void nhap() {
        try {
            super.nhap();
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap so san pham: ");
            soSanPham = s.nextInt();
        } catch (Exception e) {
            System.out.println("Co loi khi nhap nhan vien san xuat");
        }

    }

    public static void inTieuDe() {
        NhanVien.inTieuDe();
        System.out.printf("%10s %15s %15s %n", "So sp", "phu cap", "Luong");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%10d %15.2f %15.2f%n", soSanPham, tinhPhuCap(), tinhLuong());
    }

    @Override
    public String toString() {
        return "NhanVienSanXuat{" + "soSanPham=" + soSanPham + '}';
    }
}
