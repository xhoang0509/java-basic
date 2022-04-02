/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu4.bai1;

/**
 *
 * @author XuanHoang
 */
public class HinhVuong extends HinhPhang {

    private float canh;

    public HinhVuong() {

    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    @Override
    float tinhChuVi() {
        return canh * 4;
    }

    @Override
    float tinhDienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + canh 
                + " chu vi=" + tinhChuVi() 
                + " dien tich= " + tinhDienTich() + '}';
    }

}
