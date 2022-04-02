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
public class NhanVienVanPhong extends NhanVien {

    private int soNgayNghi;
    private float mucLuong;

    @Override
    public double tinhLuong() {
        return mucLuong - soNgayNghi * 10000;
    }

    @Override
    public void nhap() {
        try {
            super.nhap();
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap so ngay nghi: ");
            soNgayNghi = s.nextInt();
            System.out.print("Muc luong: ");
            mucLuong = s.nextInt();
        } catch (Exception e) {
            System.out.println("Co loi khi nhap nhan vien van phong");
        }
    }

    public static void inTieuDe() {
        NhanVien.inTieuDe();
        System.out.printf("%15s %15s %15s %15s%n", "So ngay nghi", "muc luong", "phu cap", "Luong");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%15d %15.2f %15.2f %15.2f %n", soNgayNghi, mucLuong, tinhPhuCap(), tinhLuong());
    }

    @Override
    public String toString() {
        return "NhanVienVanPhong{" + "soNgayNghi=" + soNgayNghi + ", mucLuong=" + mucLuong + '}';
    }

}
