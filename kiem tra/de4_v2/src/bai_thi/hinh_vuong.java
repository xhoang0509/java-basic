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
public class hinh_vuong extends da_giac {

    private int soCanh;

    @Override
    double tinhCV() {
        double sum = 0;
        for (int i : dsCanh) {
            sum += i;
        }
        return sum;
    }

    @Override
    double tinhDT() {
        double sum = 1;
        for (int i : dsCanh) {
            sum *= i;
        }
        return sum;
    }

    @Override
    void nhapDL() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhap ma hinh: ");
                setMaHinh(s.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
        System.out.println("Nhap so canh cua hinh vuong: ");
        soCanh = s.nextInt();

        super.dsCanh = new int[soCanh];

        Random rd = new Random();
        int temp = rd.nextInt(100) + 1;
        for (int i = 0; i < soCanh; i++) {
            dsCanh[i] = temp;
        }
    }

    String inDSCanh() {
        String temp = "";
        for (int i = 0; i < soCanh; i++) {
            temp += dsCanh[i] + " ";
        }
        return temp;
    }

    public static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s %n", "ma hinh", "so canh", "ds canh", "chu vi", "dien tich");
    }

    public void xuat() {
        System.out.printf("%10s %10d %10s %10.2f %10.2f %n", maHinh, soCanh, inDSCanh(), tinhCV(), tinhDT());
    }

}
