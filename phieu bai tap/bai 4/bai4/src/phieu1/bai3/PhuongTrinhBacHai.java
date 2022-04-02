/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu1.bai3;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author XuanHoang
 */
public class PhuongTrinhBacHai {

    private int a, b, c;
    static int maximum = 100;
    static int minimum = -100;

    public void nhap() {
        int range = maximum - minimum + 1;
        Random rd = new Random();
        a = rd.nextInt(range) + minimum;
        b = rd.nextInt(range) + minimum;
        c = rd.nextInt(range) + minimum;
    }

    public void tinh() {
        DecimalFormat df = new DecimalFormat("#.##");
        int detal = b * b - 4 * a * c;
        if (detal < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (detal == 0) {
            int x12 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: " + df.format(x12));
        } else {
            double x1 = (-b + Math.sqrt((double) detal)) / (2 * a);
            double x2 = (-b - Math.sqrt((double) detal)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem: x1 = " + df.format(x1) + " x2 = " + df.format(x2));
        }
    }

    public static void inTieuDe() {
        System.out.printf("%5s %5s %5s", "a", "b", "c\n");
    }

    public void xuat() {
        System.out.printf("%5d %5d %5d\n", a, b, c);
    }
}
