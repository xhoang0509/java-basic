/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai1;

/**
 *
 * @author XuanHoang
 */
public class HinhChuNhat extends HinhPhang {

    private float dai, rong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    float tinhChuVi() {
        return (dai + rong) * 2;
    }

    @Override
    float tinhDienTich() {
        return dai * rong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "dai=" + dai + ", rong=" + rong
                + " chu vi=" + tinhChuVi()
                + " dien tich= " + tinhDienTich() + '}';
    }

}
