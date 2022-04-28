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
public class HinhTron {

    private double banKinh;
    private String maHinh;

    public HinhTron() {
    }
    
    

    public HinhTron(double banKinh, String maHinh) {
        this.banKinh = banKinh;
        this.maHinh = maHinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) throws Exception {
        if (banKinh < 0) {
            throw new Exception("du lieu khong hop le");
        }
        this.banKinh = banKinh;
    }

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        Random rd = new Random();
        setMaHinh("HT-" + rd.nextInt(100) + 10);

        while (true) {
            try {
                System.out.print("Nhap ban kinh: ");
                setBanKinh(s.nextDouble());
                break;
            } catch (Exception e) {
            }
        }
    }

    static void inTieuDe() {
        System.out.printf("%-10s %10s %n", "Ma hinh", "Ban kinh");
    }

    public void output() {
        System.out.printf("%-10s %10.2f %n", maHinh, banKinh);
    }

}
