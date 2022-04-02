/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu1.bai1;

import java.util.Random;

/**
 *
 * @author XuanHoang
 */
public class HinhChuNhat {

    private float dai, rong;

    public void nhap() {
        Random random = new Random();
        dai = random.nextFloat() + 1;
        rong = random.nextFloat() + 1;
    }
    
    public float chuVi() {
        return (dai + rong) * 2;
    }
    
    public float dienTich() {
        return dai * rong;
    }

    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s", "chieu dai", "chieu rong", "chu vi", "dien tich\n");
    }

    public void xuat() {
        System.out.printf("%15.2f %15.2f %15.2f %15.2f", dai, rong, chuVi(), dienTich());
    }
    
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.nhap();
        HinhChuNhat.inTieuDe();
        hcn1.xuat();
    }
}
