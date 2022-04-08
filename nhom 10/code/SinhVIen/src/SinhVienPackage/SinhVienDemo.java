/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienPackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author XuanHoang
 */
public class SinhVienDemo {

    static LinkedList<SinhVien> dsSV = new LinkedList<SinhVien>();
    static int n = 5; // so luong sinh vien

    static void nhapDS() {
        for (int i = 0; i < n; i++) {
            SinhVien temp = new SinhVien();
            temp.nhap();
            dsSV.add(temp);
        }
    }

    static void xuatDS() {
        SinhVien.inTieuDe();
        for (SinhVien sinhVien : dsSV) {
            sinhVien.xuat();
        }
    }

    // thêm sv vào đầu danh sách
    static void themSVDau() {
        SinhVien temp = new SinhVien();
        temp.nhap();
        dsSV.addFirst(temp);

        System.out.println("\n\t\tDANH SAU KHI THÊM SV VÀO ĐẦU");
        xuatDS();
    }

    // thêm sv vào đầu danh sách
    static void themSVCuoi() {
        SinhVien temp = new SinhVien();
        temp.nhap();
        dsSV.addLast(temp);

        System.out.println("\n\t\tDANH SAU KHI THÊM SV VÀO Cuối");
        xuatDS();
    }

    // xóa sv vào đầu danh sách
    static void xoaSVDau() {
        dsSV.removeFirst();

        System.out.println("\n\t\tDANH SÁCH SAU KHI XÓA SV VÀO ĐẦU");
        xuatDS();
    }

    // xóa sv vào cuối danh sách
    static void xoaSVCuoi() {
        dsSV.removeLast();

        System.out.println("\n\t\tDANH ÁCH SAU KHI XÓA SV VÀO Cuối");
        xuatDS();
    }

    // lấy sv vào đầu danh sách
    static void getSVDau() {
        System.out.println("\n\t\tSinh viên đầu tiên");
        SinhVien.inTieuDe();
        dsSV.getFirst().xuat();
    }

    // lấy sv vào đầu danh sách
    static void getSVCuoi() {
        System.out.println("\n\t\tSinh viên cuối cùng");
        SinhVien.inTieuDe();
        dsSV.getLast().xuat();
    }

    // sửa sinh viên thứ 3 trong danh sách
    static void suaSV() {
        SinhVien temp = new SinhVien();
        temp.nhap();
        dsSV.set(2, temp);

        System.out.println("\n\t\tDANH ÁCH SAU KHI SỬA SV THỨ 3 LÀ");
        xuatDS();
    }

    static void sapXepTheoDiemTK() {
        Collections.sort(dsSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (o1.getDiemTK() - o2.getDiemTK());
            }
        });
        
        System.out.println("\n\t\tDANH SÁCH KHI SẮP XÉP THEO TỔNG ĐIỂM LÀ: ");
        xuatDS();
    }

    public static void main(String[] args) {
        nhapDS();
        System.out.println("\n\t\tDANH SACH VUA NHAP LA");
//        xuatDS();
        
        System.out.println(dsSV);

//        themSVDau();
//        themSVCuoi();
//
//        xoaSVDau();
//        xoaSVCuoi();
//
//        getSVDau();
//        getSVCuoi();
//
//        suaSV();
//        sapXepTheoDiemTK();

    }

}
