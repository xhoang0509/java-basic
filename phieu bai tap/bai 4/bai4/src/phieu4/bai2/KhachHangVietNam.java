/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai2;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class KhachHangVietNam extends KhachHang {

    private String doiTuong;
    private float dinhMuc;

    @Override
    public void nhap() {
        try {
            super.nhap();
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap doi tuong: ");
            doiTuong = s.nextLine();
            System.out.print("Nhap dinh muc: ");
            dinhMuc = s.nextFloat();
        } catch (Exception e) {
            System.out.println("Co loi khi nhap KH VN");
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %10s %n",
                "doi tuong", "dinh muc", "thanh tien");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-10s %10.2f %n",
                doiTuong, dinhMuc, thanhTien());
    }

    @Override
    double thanhTien() {
        if (super.soLuong <= dinhMuc) {
            return super.soLuong * donGia;
        } else {
            return super.soLuong * donGia * dinhMuc + (dinhMuc - super.soLuong) * donGia * 2.5;
        }
    }

}
