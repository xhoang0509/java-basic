/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai3;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public abstract class NhanVien {

    protected String maNhanVien;
    protected String hoTen;
    protected int namVaoLam;

    static double tongLuong;
    final double PHUCAP_BANDAU = 100000;

    abstract public double tinhLuong();

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public NhanVien() {

    }

    public NhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    protected double tinhPhuCap() {
        Date now = new Date();
        int d = LocalDate.now().getYear();
        return PHUCAP_BANDAU + (d - namVaoLam) * 20000;
    }

    public void nhap() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap ma nv: ");
            maNhanVien = s.nextLine();
            System.out.print("Nhap ho ten: ");
            hoTen = s.nextLine();
            System.out.print("Nhap nam vao lam: ");
            namVaoLam = s.nextInt();
        } catch (Exception e) {
            System.out.println("Co loi nhi nhap nhan vien ");
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %-15s %10s ", "Mã nv", "Họ tên", "Năm vào làm");
    }

    public void xuat() {
        System.out.printf("%-10s %-15s %10d", maNhanVien, hoTen, namVaoLam);
    }
}
