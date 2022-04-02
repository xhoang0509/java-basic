/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class NhanVienDemo2 {

    static NhanVien dsNv[];
    static int n; // so luong nhan vien

    static void nhap() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap so luong nhan vien: ");
                n = s.nextInt();
                dsNv = new NhanVien[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("\t\t=> Nhap thong tin nhan vien " + (i + 1));
                    dsNv[i] = new NhanVien();
                    dsNv[i].nhap();
                }
                break;
            } catch (Exception e) {
                System.out.println("CO LOI khi nhap so luong nhan vien NHAP LAI: ");
//                System.out.print("Nhap LAI so luong nhan vien: ");
//                n = s.nextInt();
            }
        }
    }

    static void xuat() {
        NhanVien.inTieuDe();
        for (int i = 0; i < n; i++) {
            dsNv[i].xuat();
        }
    }

    static void inVuotChuan() {
        NhanVien.inTieuDe();
        for (int i = 0; i < n; i++) {
            if (dsNv[i].coVuotChuan()) {
                dsNv[i].xuat();
            }
        }
    }

    public static void main(String[] args) {
        nhap();
        System.out.println("\nDANH SACH VUA NHAP LA");
        xuat();

        System.out.println("\nDANH SACH VUOT CHUAN LA");
        inVuotChuan();
    }
}
