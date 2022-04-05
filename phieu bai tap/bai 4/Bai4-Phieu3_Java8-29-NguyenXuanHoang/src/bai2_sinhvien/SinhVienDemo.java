/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_sinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class SinhVienDemo {

//    static 
//    static SinhVien[] dsSV;
    static List<SinhVien> dsSV = new ArrayList<SinhVien>();
    static int n;

    static void nhapDS() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap so luong sinh vien: ");
                n = s.nextInt();

                if (n > 0) {
                    for (int i = 0; i < n; i++) {
                        SinhVien temp = new SinhVien();
                        System.out.println("\n\t\tNHap sinh vien " + (i + 1));
                        temp.nhap();
                        dsSV.add(temp);
                    }

                }
                break;
            } catch (Exception e) {
                System.out.println("Du lieu sai. Nhap lai !");
            }
        }
    }

    static void inDS() {
        for (SinhVien sinhVien : dsSV) {
            sinhVien.xuat();
        }
    }

    static void sapXepTheoTen() {
        Collections.sort(dsSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        System.out.println("\n\t\tDANH SACH SAP XEP THEO TEN LA");
        SinhVien.inTieuDe();
        inDS();
    }

    static SinhVien diemTBMax() {
        SinhVien temp = Collections.max(dsSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (o1.getDiemTB() - o2.getDiemTB());
            }

        });
        return temp;
    }

    static SinhVien diemTBMin() {
        SinhVien temp = Collections.min(dsSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (o1.getDiemTB() - o2.getDiemTB());
            }

        });
        return temp;
    }

    public static void main(String[] args) {
        nhapDS();
        SinhVien.inTieuDe();
        inDS();

        sapXepTheoTen();

        System.out.println("\n\t\tSINH VIEN CO DIEM TB MAX LA + ");
        SinhVien.inTieuDe();
        diemTBMax().xuat();

        System.out.println("\n\t\tSINH VIEN CO DIEM TB MIN LA + ");
        SinhVien.inTieuDe();
        diemTBMin().xuat();
    }
}
