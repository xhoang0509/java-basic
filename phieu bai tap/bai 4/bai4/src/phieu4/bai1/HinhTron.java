/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai1;

/**
 *
 * @author XuanHoang
 */
public class HinhTron extends HinhPhang {

    private float banKinh;

    public HinhTron() {
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    float tinhChuVi() {
        return 2 * (float) Math.PI * banKinh;
    }

    @Override
    float tinhDienTich() {
        return (float) Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "banKinh=" + banKinh
                + " chu vi=" + tinhChuVi()
                + " dien tich= " + tinhDienTich() + '}';
    }

}
