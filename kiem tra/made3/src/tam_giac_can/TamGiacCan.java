/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tam_giac_can;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XuanHoang
 */
public class TamGiacCan extends TamGiac {

    private String maHinh;
    private int a, b, c;
    static String temp_ma = "";

    public TamGiacCan() {
        a = 0;
        b = 0;
        c = 0;
    }

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) throws Exception {
        this.maHinh = maHinh;
        if (maHinh.isEmpty()) {
            throw new Exception("Ma hinh khong duoc de trong");
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) throws Exception {
        this.a = a;
//        if (this.a != this.b || this.a != this.c) {
//            throw new Exception("canh khong bang nhau");
//        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) throws Exception {
        if (b != this.a) {
            throw new Exception("Canh khong bang nhau");
        }
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) throws Exception {
        if (this.a + this.b < c) {
            throw new Exception("Do dai canh nho hon tong hai canh con lai");
        }
        this.c = c;
    }

    @Override
    int tinhCV() {
        return a + b + c;
    }

    @Override
    float tinhDT() {
        float p = tinhCV() / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    void input() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap ma hinh:");
                setMaHinh(s.nextLine());

                while (true) {
                    try {
                        Random rd = new Random();
                        setA(rd.nextInt(100) + 1);
                        setB(rd.nextInt(100) + 1);
                        setC(rd.nextInt(100) + 1);
                        break;
                    } catch (Exception e) {
//                    System.out.println(e.getMessage() + " NHAP LAI");
                    }
                }
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + " Nhap lai");
            }
        }
    }

    static void inTieuDe() {
        System.out.printf("%-10s %10s %10s %10s %10s %10s", "ma", 'a', 'b', 'c', "chu vi", "dien tich\n");
    }

    @Override
    void output() {
        System.out.printf("%-10s %10d %10d %10d %10d %10.2f", maHinh, a, b, c, tinhCV(), tinhDT());
        System.out.println("");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
        final TamGiacCan other = (TamGiacCan) obj;
        return Objects.equals(this.maHinh, other.maHinh);
    }   

    

}
