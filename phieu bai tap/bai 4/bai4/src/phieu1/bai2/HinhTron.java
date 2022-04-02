/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu1.bai2;

import java.util.Random;

/**
 *
 * @author XuanHoang
 */
public class HinhTron {

    private float banKinh;

    public void nhap() {
        Random rd = new Random();
        banKinh = rd.nextFloat() + 1;
    }

    public float chuVi() {
        return 2 * (float) Math.PI * banKinh;
    }

    public float dienTich() {
        return (float) Math.PI * banKinh * banKinh;
    }

    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s", "Ban Kinh", "Chu Vi", "Dien Tich\n");
    }

    public void xuat() {
        System.out.printf("%15.2f %15.2f %15.2f", banKinh, chuVi(), dienTich());
        System.out.println("");
    }

}
