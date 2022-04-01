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
public class Xe {

    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: ");
        tenChuXe = s.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe = s.nextLine();
        System.out.print("Nhap dung tich: ");
        dungTich = s.nextInt();
        System.out.print("Nhap tri gia: ");
        triGia = s.nextInt();
    }

    public double tinhThue() {
        double thue = 0;
        if (dungTich < 100) {
            thue = triGia / 100;
        } else if (dungTich < 200) {
            thue = triGia * 3 / 100;
        } else {
            thue = triGia * 5 / 100;
        }
        return thue;
    }

    public static void xuatTieuDe() {
        // in xong tieu de xuong dong
        System.out.printf("%15s %15s %15s %15s %15s %n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
    }

    public void xuat() {
        System.out.printf("%15s %15s %15d %15.1f %15.1f %n", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }
}
