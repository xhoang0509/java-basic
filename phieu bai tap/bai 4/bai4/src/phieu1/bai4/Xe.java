/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu1.bai4;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class Xe {

    private String tenChuXe;
    private String loaiXe;
    private float dungTich;
    private float triGia;

    public void nhap() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap ten chu xe: ");
            tenChuXe = s.nextLine();
            System.out.print("Nhap loai xe: ");
            loaiXe = s.nextLine();
            System.out.print("Nhap dung tich: ");
            dungTich = s.nextFloat();
            System.out.print("Nhap tri gia: ");
            triGia = s.nextFloat();
        } catch (Exception e) {
            System.out.println("Loi nhap du lieu xe " + e.getMessage());
        }
    }

    public float tinhThue() {
        if (dungTich < 0) {
            return 0;
        } else if (dungTich < 100) {
            return dungTich * (float) 0.01;
        } else if (dungTich <= 200) {
            return dungTich * (float) 0.03;
        } else {
            return dungTich * (float) 0.05;
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-15s %-15s %15s %15s %15s", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop\n");
    }

    public void xuat() {
        System.out.printf("%-15s %-15s %15.1f %15.1f %15.1f", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
        System.out.println("");
    }
}
