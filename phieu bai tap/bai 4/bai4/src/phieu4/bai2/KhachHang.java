/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai2;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public abstract class KhachHang {

    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHD;
    protected float soLuong;
    protected float donGia;

    abstract double thanhTien();

    public void nhap() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap ma KH: ");
            maKhachHang = s.nextLine();
            System.out.print("Nhap ho ten KH: ");
            hoTen = s.nextLine();
            System.out.print("Nhap ngay ra HD(ngay/thang/nam): ");
            ngayRaHD = s.nextLine();
            System.out.print("Nhap so luong: ");
            soLuong = s.nextFloat();
            System.out.print("Nhap don gia: ");
            donGia = s.nextFloat();
        } catch (Exception e) {
            System.out.println("Co loi kh nhap KH");
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-15s %-15s %15s %15s %15s",
                "Ma KH", "Ho Ten", "Ngay ra HD", "So Luong", "Don Gia");
    }

    public void xuat() {
        System.out.printf("%-15s %-15s %15s %15.2f %15.2f %15.2f",
                maKhachHang, hoTen, ngayRaHD,soLuong,donGia);
    }
}
