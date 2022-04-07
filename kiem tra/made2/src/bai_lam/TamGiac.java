/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_lam;

import java.util.Random;

/**
 *
 * @author XuanHoang
 */
public class TamGiac implements HinhPhang {

    private int canh1, canh2, canh3;

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) throws Exception {
        if (canh1 <= 0) {
            throw new Exception("Canh khong hop le");
        }
        this.canh1 = canh1;

    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) throws Exception {
        if (canh2 <= 0) {
            throw new Exception("Canh khong hop le");
        }
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) throws Exception {
        if (canh1 > this.canh2 + canh3
                || this.canh2 > this.canh1 + canh3
                || canh3 > this.canh1 + this.canh2) {
            throw new Exception("Canh khong hop le");
        }
        this.canh3 = canh3;
    }

    public void nhap() {
        while (true) {
            try {
                Random rd = new Random();
                setCanh1(rd.nextInt(100) + 1);
                setCanh2(rd.nextInt(100) + 1);
                setCanh3(rd.nextInt(100) + 1);
                System.out.println("Nhap thanh cong !");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + ", nhap lai !");
            }
        }
    }

    public static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s%n",
                "canh 1", "canh 2", "canh 3", "chu vi", "dien tich");
    }

    public void xuat() {
        System.out.printf("%10d %10d %10d %10.2f %10.2f%n",
                canh1, canh2, canh3, tinhCV(), tinhDT());
    }

    @Override
    public float tinhCV() {
        return canh1 + canh2 + canh3;
    }

    @Override
    public float tinhDT() {
        float p = tinhCV() / 2;
        return (float) Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

}
