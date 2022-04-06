/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaGiac;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class HinhVuong extends DaGiac {

    private int canh;

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) throws Exception {
        if (canh < 0) {
            throw new Exception("Canh phai lon hon 0");
        }
        this.canh = canh;
    }

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) throws Exception {
        if (maHinh.isEmpty()) {
            throw new Exception("Ma hinh khong duoc de trong");
        }
        this.maHinh = maHinh;
    }

    public int getDsCanh() {
        return dsCanh;
    }

    public void setDsCanh(int dsCanh) {
        this.dsCanh = dsCanh;
    }

    @Override
    double tinhCV() {
        return canh * dsCanh;
    }

    @Override
    double tinhDT() {
        return canh * canh;
    }

    @Override
    void nhapDL() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap ma hinh: ");
                setMaHinh(s.nextLine());
                super.dsCanh = 4;
                while (true) {
                    try {
                        Random rd = new Random();
                        setCanh(rd.nextInt(100) + 1);
                        break;
                    } catch (Exception e) {
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + ", nhap lai !!");
            }
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-15s %10s %10s %15s %15s %n", "Ma hinh", "Ds canh", "Canh", "Chu vi", "Dien tich");
    }

    public void xuat() {
        System.out.printf("%-15s %10d %10s %15.2f %15.2f %n", super.maHinh, super.dsCanh, canh, tinhCV(), tinhDT());
    }

    public boolean equals(String maHinhSS) {
        return Objects.equals(this.maHinh, maHinhSS);
    }

}
