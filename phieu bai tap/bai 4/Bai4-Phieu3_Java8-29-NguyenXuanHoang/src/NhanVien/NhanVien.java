/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class NhanVien {

    private String maNV;
    private int soSP;
    final int VUOT_CHUAN = 500;
    final int DON_GIA_1 = 20000;
    final int DON_GIA_2 = 30000;

    public NhanVien() {

    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) throws Exception {
        if (maNV.isEmpty()) {
            throw new Exception("Co loi khi ma NV ");
        } else {
            this.maNV = maNV;
        }
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) throws Exception {
        if (soSP < 0) {
//            this.soSP = 0;
            throw new Exception("Co loi khi nhap san pham ");
        } else {
            this.soSP = soSP;
        }
    }

    public boolean coVuotChuan() {
        if (soSP > VUOT_CHUAN) {
            return true;
        } else {
            return false;
        }
    }

    public String getTongKet() {
        if (coVuotChuan()) {
            return "Vuot";
        } else {
            return "";
        }
    }

    public int getLuong() {
        if (!coVuotChuan()) {
            return soSP * DON_GIA_1;
        } else {
            return VUOT_CHUAN * DON_GIA_1 + (soSP - VUOT_CHUAN) * DON_GIA_2;
        }
    }

    public void nhap() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap ma nv: ");
                setMaNV(s.nextLine());
                System.out.print("Nhap so luong san pham: ");
                setSoSP(s.nextInt());
                break;
            } catch (Exception e) {
//                throw new Exception();
                System.out.println("SOS Co loi khi nhan vien NHAP LAI !!!");
            }
        }

    }

    public static void inTieuDe() {
        System.out.printf("%-10s %-10s %10s %-15s", "ma nv", "so sp", "luong", "tong ket");
        System.out.println("");
    }

    public void xuat() {
        System.out.printf("%-10s %-10d %10d %-15s", maNV, soSP, getLuong(), getTongKet());
        System.out.println("");
    }

}
