package quanlynhanvien;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author XuanHoang
 */
public class NhanVienDemo {

    static int soNv, loaiNv;
    static double tongLuong = 0;
    static NhanVien dsNv[];

    public static void main(String[] args) {
        nhap();
        xuatDanhSach();
    }

    static void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        soNv = s.nextInt();
        dsNv = new NhanVien[soNv];

        for (int i = 0; i < soNv; i++) {
            System.out.println("CHON LOAI NHAN VIEN");
            System.out.println("1.Nhan vien san xuat \t2.Nhan vien van phong");
            loaiNv = s.nextInt();
            if (loaiNv == 1) {
                dsNv[i] = new NhanVienSanXuat();
            } else {
                dsNv[i] = new NhanVienVanPhong();
            }

            dsNv[i].nhap();

            // tinh tong luong
            tongLuong += dsNv[i].tinhLuong() + dsNv[i].tinhPhuCap();
        }
    }

    static void xuatDanhSach() {
        System.out.println("\n\tDs nhan vien SAN XUAT ");
        NhanVienSanXuat.inTieuDe();
        for (int i = 0; i < soNv; i++) {
            if (dsNv[i] instanceof NhanVienSanXuat) {
                dsNv[i].xuatDuLieu();
            }
        }

        System.out.println("\n\tDs nhan vien VAN PHONG ");
        NhanVienSanXuat.inTieuDe();
        for (int i = 0; i < soNv; i++) {
            if (dsNv[i] instanceof NhanVienVanPhong) {
                dsNv[i].xuatDuLieu();
            }
        }

        DecimalFormat f = new DecimalFormat("###,###.0#");
        System.out.println("Tong luong nhan vien: " + f.format(tongLuong));
        
    }
}
