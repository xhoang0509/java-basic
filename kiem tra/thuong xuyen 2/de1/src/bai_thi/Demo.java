/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_thi;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class Demo {

    static LinkedList<HinhCN> hinhCNs = new LinkedList<HinhCN>();
    static int n;

    // kiem tra ma hinh da ton tai trong danh sach
    // co return true
    // khong return false
    static boolean checkMaHinh(String maHinh) {
        for (HinhCN hinhCN : hinhCNs) {
            if (hinhCN.getMaHinh().equals(maHinh)) {
                return true;
            }
        }
        return false;
    }

    static void nhapDS() {
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Nhap so luong hinh cn (n < 5): ");
            n = s.nextInt();
            if (n < 0 || n > 5) {
                System.out.println("Nhap lai n !");
            }
        } while (n < 0 || n > 5);

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap hinh CN " + (i + 1));
            while (true) {
                HinhCN x = new HinhCN();
                x.input();
                if (checkMaHinh(x.getMaHinh())) {
                    System.out.println("Ma hinh da ton tai, nhap lai");
                } else {
                    hinhCNs.add(x);
                    break;
                }
            }
        }
    }

    static void xuatDS() {
        if (hinhCNs.isEmpty()) {
            System.out.println("\n\t\tDS trong !");
        } else {
            System.out.println("\n\t\tDS hinh chu nhat");
            HinhCN.inTieuDe();
            for (HinhCN hinhCN : hinhCNs) {
                hinhCN.output();
            }
        }
    }

    static void suaDS() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma hinh can sua: ");
        String maHinh = s.nextLine();
        int index = -1;
        boolean isFind = false;

        for (int i = 0; i < hinhCNs.size(); i++) {
            if (hinhCNs.get(i).getMaHinh().equals(maHinh)) {
                index = i;
                isFind = true;
                break;
            }
        }

        if (isFind) {
            HinhCN x = new HinhCN();
            System.out.println("\n\t\tNhap du lieu hinh CN moi");
            while (true) {
                x.input();
                if (checkMaHinh(x.getMaHinh())) {
                    System.out.println("Ma hinh da ton tai, nhap lai");
                } else {
                    hinhCNs.set(index, x);
                    System.out.println("\n\t\tDS MOI LA");
                    xuatDS();
                    break;
                }
            }

        } else {
            System.out.println("\n\t\tKhong tim thay hinh CN co ma " + maHinh);
        }
    }
    
    static void dienTichMax() {
        HinhCN x = Collections.max(hinhCNs, new Comparator<HinhCN>() {
            @Override
            public int compare(HinhCN o1, HinhCN o2) {
                return o1.tinhDT() - o2.tinhDT();
            }
        });
        
        System.out.println("\n\t\tHCN co dien tich lon nhat la");
        HinhCN.inTieuDe();
        x.output();
    }

    public static void main(String[] args) {
        nhapDS();
        xuatDS();
        suaDS();
        dienTichMax();
    }
}
