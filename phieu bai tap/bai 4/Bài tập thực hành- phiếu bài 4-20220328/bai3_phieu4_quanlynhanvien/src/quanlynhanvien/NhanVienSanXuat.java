/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class NhanVienSanXuat extends NhanVien {

    private int soSanPham;

    public NhanVienSanXuat(String maNv) {
        super(maNv);
        soSanPham = 0;
    }

    public NhanVienSanXuat() {
        super();
        soSanPham = 0;
    }

    @Override
    public double tinhLuong() {
        return soSanPham * 10000;
    }

    public void nhap() {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so san pham: ");
        soSanPham = s.nextInt();
    }

    public static void inTieuDe() {
        NhanVien.inTieuDe();
        System.out.printf("%15s %15s %15s", " so sp", " phu cap", " luong");
    }

    @Override
    public void xuatDuLieu() {
        super.xuatDuLieu();
        System.out.printf("%15d %15.2f %15.2f", soSanPham, tinhPhuCap(), tinhLuong());
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

}
