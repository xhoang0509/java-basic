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
public class NhanVienMain {

    static NhanVien dsnv[];
    static int n;

    static void nhapDSNV() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong danh sach sinh vien n = ");
        n = s.nextInt();        
        dsnv = new NhanVien[n];
        
        // nhap mang
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nhan vien thu " + (i+1));
            dsnv[i] = new NhanVien();
            dsnv[i].nhap();
        }
    }
    static void xuatDSNV() {
        System.out.println("Danh sach nhan vien sau khi nhap: ");
        NhanVien.xuatTieuDe();
        for (NhanVien nv : dsnv) {
            nv.xuat();
        }        
    }
    public static void main(String[] args) {
               
        nhapDSNV();
        xuatDSNV();
        
    }
    
}
