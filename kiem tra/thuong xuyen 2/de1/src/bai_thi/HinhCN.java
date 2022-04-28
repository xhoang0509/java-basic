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
public class HinhCN {

    protected String maHinh;
    protected int chieuDai;
    protected int chieuRong;

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) throws Exception {
        if (maHinh.isEmpty()) {
            throw new Exception("Ma hinh khong duoc de trong !");
        }
        this.maHinh = maHinh;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) throws Exception {
        if (chieuDai < 0) {
            throw new Exception("du lieu khong hop le");
        }
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) throws Exception {
        if (chieuRong < 0) {
            throw new Exception("du lieu khong hop le");
        }
        if (chieuRong > this.chieuDai) {
            throw new Exception("du lieu khong hop le");
        }
        this.chieuRong = chieuRong;
    }

    static void inTieuDe() {
        System.out.printf("%10s %10s %10s  %10s %n", "ma hinh", "chieu dai", "chieu rong", "dien tich");
    }

    public void input() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap ma hinh: ");
                setMaHinh(s.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + " nhap lai ");
            }
        }

        while (true) {
            try {
                Random rd = new Random();
                setChieuDai(rd.nextInt(50) + 1);
                setChieuRong(rd.nextInt(50) + 1);
                break;
            } catch (Exception e) {
                
            }
        }
    }
    
    public int tinhDT() {
        return chieuDai * chieuRong;
    }

    public void output() {
        System.out.printf("%10s %10d %10d %10d %n", maHinh, chieuDai, chieuRong,tinhDT());
    }

}
