/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_sinhvien;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class SinhVienDemo {

//    static 
    static SinhVien[] dsSV;
    static int n;

    static void nhapDS() {
        while (true || n < 0) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap so luong sinh vien: ");
                n = s.nextInt();

                if (n < 0) {
                    continue;
                } else {

                    dsSV = new SinhVien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n\t\t=== Nhap sinh vien " + (i + 1));
                        dsSV[i] = new SinhVien();
                        dsSV[i].nhap();
                    }

                    break;
                }

            } catch (Exception e) {
                System.out.println("Du lieu sai. Nhap lai !");
            }
        }
    }

    static void inDS() {
        for (int i = 0; i < n; i++) {
            System.out.println(dsSV[i]);
        }
    }

    public static void main(String[] args) {
        nhapDS();
        SinhVien.inTieuDe();
        inDS();
    }
}
