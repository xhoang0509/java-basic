/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_thi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class demo {

    static ArrayList<hinh_vuong> hinhVuongs = new ArrayList<hinh_vuong>();
    static int n;

    // check ma hinh k trung nhau
    // da ton tai => true
    // chua ton tai => false
    static boolean checkMaHinh(String maHinh) {
        for (hinh_vuong hinhVuong : hinhVuongs) {
            if (hinhVuong.getMaHinh().equals(maHinh)) {
                return true;
            }
        }
        return false;
    }

    static void nhapDS() {
        do {
            Scanner s = new Scanner(System.in);
            while (true) {
                try {
                    System.out.print("Nhap so luong hinh vuong: ");
                    s.nextLine();
                    n = s.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("nhap lai di, sai du lieu roi ");
                    continue;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("\n\t\tNhap hinh vuong: " + (i + 1));
                hinh_vuong x = new hinh_vuong();

                while (true) {
                    x.nhapDL();
                    if (checkMaHinh(x.getMaHinh())) {
                        System.out.println("ma hinh da ton tai, nhap ma khac");
                    } else {
                        hinhVuongs.add(x);
                        break;
                    }
                }

            }

        } while (n < 0 || n > 10);
    }

    static void inDS() {
        System.out.println("\n\t\tDS vua nhap la");
        hinh_vuong.inTieuDe();
        for (hinh_vuong hinhVuong : hinhVuongs) {
            hinhVuong.xuat();
        }
    }

    static void suaDS() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma hinh can sua: ");
        String maHinh = s.nextLine();
        boolean isFind = false;
        hinhVuongs x = new hinh_vuong();
        
        for (hinh_vuong hinhVuong : hinhVuongs) {
            if (hinhVuong.getMaHinh().equals(maHinh)) {
                isFind = true;
                x = hinhVuong;
                break;
            }
        }

        if (isFind) {

        } else {
            System.out.println("\n\t\tKhong tim thay ma ");
        }
    }

    static void chuViMax() {
        hinh_vuong x = Collections.max(hinhVuongs, new Comparator<hinh_vuong>() {
            @Override
            public int compare(hinh_vuong o1, hinh_vuong o2) {
                return (int) (o1.tinhCV() - o2.tinhCV());
            }
        });

        System.out.println("\n\t\tHinh vuong co chu vi max la ");
        hinh_vuong.inTieuDe();
        x.xuat();
    }

    public static void main(String[] args) {
        nhapDS();
        inDS();
        chuViMax();

    }
}
