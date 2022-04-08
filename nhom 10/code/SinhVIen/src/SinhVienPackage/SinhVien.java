/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienPackage;

import java.util.Random;

/**
 *
 * @author XuanHoang
 */
public class SinhVien {

    static String listName[] = new String[]{"Adams", "Baker", "Clark", "Davis", "Evans", "Frank", "Ghosh", "Hills", "Irwin", "Jones", "Klein", "Lopez", "Mason", "Nalty", "Ochoa", "Patel", "Quinn", "Reily", "Smith", "Trott", "Usman", "Valdo", "White", "Xiang", "Yakub", "Zafar"};

    private String maSV;
    private String hoTen;
    private float diemLT, diemTH, diemTK;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(float diemTK) {
        this.diemTK = diemTK;
    }

    public void nhap() {
        Random rd = new Random();
        setMaSV("SV" + rd.nextInt(100));
        int indexName = rd.nextInt(listName.length - 1);       
        setHoTen(listName[indexName]);
        setDiemLT(rd.nextInt(10) + 1);
        setDiemTH(rd.nextInt(10) + 1);
        setDiemTK((diemLT + diemTH) / 2);
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %-10s %10s %10s %10s%n",
                "ma sv", "ho ten", "diem lt", "diem th", "diem tk");
    }

    public void xuat() {
        System.out.printf("%-10s %-10s %10.2f %10.2f %10.2f%n",
                maSV, hoTen, diemLT, diemTH, diemTK);
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + ", diemTK=" + diemTK + '}';
    }
    
    

}
