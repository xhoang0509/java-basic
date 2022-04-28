/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_thi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class TamGiac {

    private String maHinh;
    private int canh1;
    private int canh2;
    private int canh3;

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) throws Exception {
        if (maHinh.isEmpty()) {
            throw new Exception("ma hinh khong duoc de trong");
        }
        this.maHinh = maHinh;
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) throws Exception {
        if (canh1 < 0) {
            throw new Exception("du lieu khong hop le");
        }
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) throws Exception {
        if (canh2 < 0) {
            throw new Exception("du lieu khong hop le");
        }
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) throws Exception {
        if (this.canh1 + this.canh2 < canh3) {
            throw new Exception("du lieu khong hop le");
        }
        this.canh3 = canh3;
    }

    public void input() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap ma hinh: ");
                setMaHinh(s.nextLine());
                break;
            } catch (Exception e) {
            }
        }

        while (true) {
            try {
                Random rd = new Random();
                setCanh1(rd.nextInt(100) + 1);
                setCanh2(rd.nextInt(100) + 1);
                setCanh3(rd.nextInt(100) + 1);
                break;
            } catch (Exception e) {
            }
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %10s %10s %10s %n", "Ma hinh", "Canh 1", "Canh 2", "Canh 3");
    }

    public void output() {
        System.out.printf("%-10s %10d %10d %10d %n", maHinh, canh1, canh2, canh3);
    }

}
