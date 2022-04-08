/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma_de_3_v2;

import java.util.Random;

/**
 *
 * @author XuanHoang
 */
public class TamGiacCan extends HinhPhang {

    private int canh1, canh2, canh3;

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public void setCanh2(int canh2) throws Exception {
        if (canh2 != this.canh1) {
            throw new Exception("canh 2 khong bang canh 1");
        }
        this.canh2 = canh2;
    }

    public void setCanh3(int canh3) throws Exception {
        if (canh3 >= this.canh1 + this.canh2) {
            throw new Exception("canh 3 khong nho hon 2 canh con lai");
        }
        this.canh3 = canh3;
    }

    public void nhap() {
        while (true) {
            try {
                Random rd = new Random();
                setCanh1(rd.nextInt(100) + 1);
                setCanh2(rd.nextInt(100) + 1);
                setCanh3(rd.nextInt(100) + 1);
                System.out.println("nhap tam giac thanh cong");
                break;
            } catch (Exception e) {
//                System.out.println(e.getMessage() + ", nhap lai !");
            }
        }
    }

    public static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s%n",
                "canh 1", "canh 2", "canh 3", "chu vi", "dien tich");
    }
    
    public void xuat() {
        System.out.printf("%10d %10d %10d %10d %10.2f%n",
               canh1,canh2,canh3,tinhCV(),tinhDT());
    }

    @Override
    int tinhCV() {
        return canh1 + canh2 + canh3;
    }

    @Override
    float tinhDT() {
        float p = (float) tinhCV() / 2;
        return (float) Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

}
