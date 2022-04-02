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
public class XeDemo {

    static Scanner s = new Scanner(System.in);
    static Xe dsXe[];
    static int soLuongXe;

    public static void nhap() {
        try {
            System.out.print("Nhap so luong xe: ");
            soLuongXe = s.nextInt();
            dsXe = new Xe[soLuongXe];
            for (int i = 0; i < soLuongXe; i++) {
                System.out.println("\n\t\t=>nhap thong tin xe " + (i + 1));
                dsXe[i] = new Xe();
                dsXe[i].nhap();
            }
        } catch (Exception e) {
            System.out.println("Co loi khi nhap so luong xe " + e.getMessage());
        }
    }

    public static void xuat() {
        if (soLuongXe <= 0) {
            System.out.println("Danh sach xe trong");
        } else {
            Xe.inTieuDe();
            for (int i = 0; i < soLuongXe; i++) {
                dsXe[i].xuat();
            }
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("===MENU===");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. In danh sach");
            System.out.println("3. Thoat");

            choice = s.nextInt();
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (choice != 3);
    }
}
