/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class NhanVienDemo {

    static Scanner s = new Scanner(System.in);
    static int soNhanVien, loaiNhanVien; // 1. san xuat 2.van phong
    static double tongLuong = 0;
    static NhanVien dsNV[];

    static void nhap() {
        try {
            System.out.print("Nhap so luong nhan vien = ");
            soNhanVien = s.nextInt();
            dsNV = new NhanVien[soNhanVien];

            for (int i = 0; i < soNhanVien; i++) {
                System.out.println("\n=> Chon loai nhan vien");
                System.out.println("1.Nhap nhan vien SAN XUAT");
                System.out.println("2.Nhap nhan vien VAN PHONG");
                loaiNhanVien = s.nextInt();

                if (loaiNhanVien == 1) {
                    dsNV[i] = new NhanVienSanXuat();
                } else {
                    dsNV[i] = new NhanVienVanPhong();
                }
                System.out.println("\n\t\t==>Nhap nhan vien thu: " + (i + 1));
                dsNV[i].nhap();

                // tinh tong luong
                tongLuong += dsNV[i].tinhLuong() + dsNV[i].tinhPhuCap();
            }
        } catch (Exception e) {
            System.out.println("Co loi khi nhap danh sach nhan vien !");
        }
    }

    static void xuatDS() {
        System.out.println("\nDanh sach nhan vien SX cong ty la ");
        NhanVienSanXuat.inTieuDe();
        for (int i = 0; i < soNhanVien; i++) {
            if (dsNV[i] instanceof NhanVienSanXuat) {
                dsNV[i].xuat();
            }
        }

        System.out.println("\nDanh sach nhan vien VP cong ty la ");
        NhanVienVanPhong.inTieuDe();
        for (int i = 0; i < soNhanVien; i++) {
            if (dsNV[i] instanceof NhanVienVanPhong) {
                dsNV[i].xuat();
            }
        }

        DecimalFormat f = new DecimalFormat("###,###.0#");
        System.out.println("Tong luong nhan vien: " + f.format(tongLuong));
    }

    public static void main(String[] args) {
        nhap();
        xuatDS();
       
        
    }
}
