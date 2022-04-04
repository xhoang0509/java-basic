/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package made1;

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
            throw new Exception("Chieu dai phai lon hon 0");
        }
        if (rong > this.dai) {
            throw new Exception("Chieu rong khong hop le");
        }
        this.rong = rong;
    }

    public void nhap() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap ma: ");
                try {
                    setMaHinh(s.nextLine());
                    System.out.print("Nhap chieu dai: ");
                    setDai(s.nextInt());
                    System.out.print("Nhap chieu rong: ");
                    setRong(s.nextInt());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " nhap lai");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + " nhap lai ");
            }
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %10s %10s %10s %10s",
                "Ma hinh", "chieu dai", "chieu rong", "chu vi", "chu vi");
    }

    public void xuat() {
        System.out.printf("%-10s %10s %10s %10s %10s",
                "Ma hinh", "chieu dai", "chieu rong", "chu vi", "chu vi");
    }

    @Override
    int tinhCV() {
        return (dai + rong) * 2;
    }

    @Override
    int tinhDT() {
        return dai * rong;
    }
}
