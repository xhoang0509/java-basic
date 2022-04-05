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
public class SinhVien {

    private String maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    private float diemTB;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) throws Exception {

        if (maSV.isEmpty()) {
            throw new Exception("Yeu cau ma sv khong duoc de trong !");
        }
        this.maSV = maSV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    // chi lay ten sinh vien 
    public String getTen() {
        String[] tens = hoTen.trim().split(" ");
        return tens[tens.length - 1];
    }

    public void setHoTen(String hoTen) throws Exception {

        if (hoTen.isEmpty()) {
            throw new Exception("Yeu cau ho ten khong dc de trong");
        }
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) throws Exception {
        this.diemLT = diemLT;
        if (diemLT < 0 || diemLT > 10) {
            throw new Exception("Diem khong hop le");
        }
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) throws Exception {
        this.diemTH = diemTH;
        if (diemTH < 0 || diemTH > 10) {
            throw new Exception("Diem khong hop le");
        }
    }

    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
        this.diemTB = 0;
    }

    public SinhVien(String maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.diemTB = (diemLT + diemTH) / 2;
    }

    public void nhap() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap ma sv: ");
                setMaSV(s.nextLine());
                System.out.print("Nhap ho ten: ");
                setHoTen(s.nextLine());
                System.out.print("Nhap diem ly thuyet: ");
                setDiemLT(s.nextFloat());
                System.out.print("Nhap diem thuc hanh: ");
                setDiemTH(s.nextFloat());

                setDiemTB((diemLT + diemTH) / 2);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + " NHAP LAI !!! ");
            }
        }
    }

    public String getKetQua() {
        if (diemTB >= 5) {
            return "Dau";
        } else {
            return "Rot";
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %-15s %10s %10s %10s %-10s %n",
                "Ma sv", "Ho ten", "Diem LT", "Diem TH", "Diem TB", "Ket qua");
    }

    public void xuat() {
        System.out.printf("%-10s %-15s %10.2f %10.2f %10.2f %-10s %n",
                maSV, hoTen, diemLT, diemTH, diemTB, getKetQua());
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen
                + ", diemLT=" + diemLT + ", diemTH=" + diemTH + ", diemTB="
                + diemTB + ", ket qua=" + getKetQua() + '}';
    }

}
