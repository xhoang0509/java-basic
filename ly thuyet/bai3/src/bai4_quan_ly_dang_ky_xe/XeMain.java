/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4_quan_ly_dang_ky_xe;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class XeMain {

    static Xe dsXe[];
    static int n; // so luong xe

    static void nhap() {
        System.out.print("Nhap so luong xe: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        // xin cap phat mang
        dsXe = new Xe[n];
        for (int i = 0; i < n; i++) {
            // xin cap phat cho phan tu thu i
            System.out.println("\tNhap thong tin xe: " + (i+1));
            dsXe[i] = new Xe();
            dsXe[i].nhap();
        }
    }

    static void xuat() {
        Xe.xuatTieuDe();
        for (Xe ele : dsXe) {
            ele.xuat();
        }
    }

    public static void main(String[] args) {

        int chon;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("\n1.Nhap danh sach xe");
            System.out.println("2.Xuat bang ke thue truoc ba");
            System.out.println("3.Thoat");
            System.out.print("NHAP LUA CHON: ");
            chon = s.nextInt();

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (chon != 3);

    }
}
