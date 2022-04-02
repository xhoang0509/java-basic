/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class KhachHangDemo {
    static Scanner s = new Scanner(System.in);
    static int soKH, loaiKH; // 1. vn 2.nuoc ngoai    
    static KhachHang dsKH[];

    static void nhap() {
        try {
            System.out.print("Nhap so luong KH: ");
            soKH = s.nextInt();
            dsKH = new KhachHang[soKH];

            for (int i = 0; i < soKH; i++) {
                System.out.println("\n=> Chon loai KH");
                System.out.println("1.Nhap KH Viet Nam");
                System.out.println("2.Nhap KH Nuoc Ngoai");
                loaiKH = s.nextInt();

                if (loaiKH == 1) {
                    dsKH[i] = new KhachHangVietNam();
                } else {
                    dsKH[i] = new KhachHangNuocNgoai();
                }
                System.out.println("\n\t\t==>Nhap khach hang thu: " + (i + 1));
                dsKH[i].nhap();
            }
        } catch (Exception e) {
            System.out.println("Co loi khi nhap danh sach kh !");
        }
    }

    static void xuatDS() {
        System.out.println("\nDanh sach KH VN ");
        KhachHangVietNam.inTieuDe();
        for (int i = 0; i < soKH; i++) {
            if (dsKH[i] instanceof KhachHangVietNam) {
                dsKH[i].xuat();
            }
        }

        System.out.println("\nDanh sach KH Nuoc Ngoai ");
        KhachHangNuocNgoai.inTieuDe();
        for (int i = 0; i < soKH; i++) {
            if (dsKH[i] instanceof KhachHangNuocNgoai) {
                dsKH[i].xuat();
            }
        }
    }

    public static void main(String[] args) {
        nhap();
        xuatDS();       
        
    }
}
