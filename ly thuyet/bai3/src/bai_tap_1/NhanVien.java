/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_tap_1;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class NhanVien {

    private String hoDem;
    private String ten;
    private NgayThang ngaySinh = new NgayThang();
    private NgayThang ngayVaoLam = new NgayThang();

    void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho dem: ");
        hoDem = s.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        ten = s.nextLine();
        System.out.print("Nhap ngay, thang, nam sinh: ");
        ngaySinh.nhap();
        System.out.print("Nhap ngay, thang, nam vao lam: ");
        ngayVaoLam.nhap();
    }

    static void xuatTieuDe() {
        System.out.printf("%15s %15s %15s %15s %n", "Ho dem", "Ten", "Ngay sinh", "Ngay vao lam");
    }

    public void xuat() {
        System.out.printf("%15s %15s %15s %15s %n", hoDem, ten, ngaySinh, ngayVaoLam);
    }
        
}
