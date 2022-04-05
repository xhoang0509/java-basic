/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package made1;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class HinhCN extends HinhPhang {

    private String maHinh;
    private int dai, rong;

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) throws Exception {
        if (maHinh.isEmpty()) {
            throw new Exception("Ma hinh khong duoc de trong");
        }
        this.maHinh = maHinh;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) throws Exception {

        if (dai < 0) {
            throw new Exception("Chieu dai phai lon hon 0");
        }
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) throws Exception {

        if (rong < 0) {
            throw new Exception("Chieu rong phai lon hon 0");
        }
        if (rong > this.dai) {
            throw new Exception("=> Chieu rong khong hop le");
        }
        this.rong = rong;
    }

    public void nhap() {
        int temp;
        while (true) {
            try {
                Random rd = new Random();
                temp = rd.nextInt(10) + 1;
                String temp2 = "";
                if (temp < 10) {
                    temp2 = "0" + String.valueOf(temp);
                } else {
                    temp2 = String.valueOf(temp);
                }
                setMaHinh("CN" + temp2);
                while (true) {
                    try {
                        setDai(rd.nextInt(100) + 1);
                        setRong(rd.nextInt(100) + 1);
                        System.out.println("Nhap chieu dai, rong thanh cong !");
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage() + ", dang nhap lai");
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + ", dang nhap lai ");
            }
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %10s %10s %10s %10s %n",
                "Ma hinh", "chieu dai", "chieu rong", "chu vi", "dien tich");
    }

    public void xuat() {
        System.out.printf("%-10s %10d %10d %10d %10d %n",
                maHinh, dai, rong, tinhCV(), tinhDT());
    }

    @Override
    int tinhCV() {
        return (dai + rong) * 2;
    }

    @Override
    int tinhDT() {
        return dai * rong;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HinhCN other = (HinhCN) obj;
        return Objects.equals(this.maHinh, other.maHinh);
    }

}
