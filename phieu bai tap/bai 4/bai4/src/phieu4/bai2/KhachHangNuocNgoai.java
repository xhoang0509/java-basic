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
public class KhachHangNuocNgoai extends KhachHang {

    private String quocTich;

    @Override
    public void nhap() {
        try {
            super.nhap();
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap quoc tich: ");
            quocTich = s.nextLine();
        } catch (Exception e) {
            System.out.println("Co loi khi nhap KH NC");
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %n",
                "quoc tich", "thanh tien");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-10s %n",
                quocTich, thanhTien());
    }

    @Override
    double thanhTien() {
        return super.soLuong * super.donGia;
    }
}
