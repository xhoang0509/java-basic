/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma_de_3_v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author XuanHoang
 */
public class TamGiacDemo {

    static int n = 10;
    static ArrayList<TamGiacCan> dsTGC = new ArrayList<TamGiacCan>();
    static TamGiacCan dsTGC2[] = new TamGiacCan[n];

    static void nhapDS() {
        for (int i = 0; i < n; i++) {
            TamGiacCan temp = new TamGiacCan();
            temp.nhap();
            dsTGC.add(temp);
        }
    }

    static void xuatDS() {
        TamGiacCan.inTieuDe();
        for (TamGiacCan tamGiacCan : dsTGC) {
            tamGiacCan.xuat();
        }
    }

    static TamGiacCan dienTichMax() {
//        float temp = 0;
//        int index = -1;
//        for (TamGiacCan tamGiacCan : dsTGC) {
//            if (temp < tamGiacCan.tinhDT()) {
//                temp = tamGiacCan.tinhDT();
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (temp == dsTGC.get(i).tinhDT()) {
//                index = i;
//            }
//        }
//        return dsTGC.get(index);
        TamGiacCan temp = Collections.max(dsTGC, new Comparator<TamGiacCan>() {
            @Override
            public int compare(TamGiacCan o1, TamGiacCan o2) {
                return (int) (o1.tinhDT() - o2.tinhDT());
            }
        });

        return temp;
    }

    static TamGiacCan dienTichMin() {

        TamGiacCan temp = Collections.min(dsTGC, new Comparator<TamGiacCan>() {
            @Override
            public int compare(TamGiacCan o1, TamGiacCan o2) {
                return (int) (o1.tinhDT() - o2.tinhDT());
            }
        });

        return temp;
    }

    public static void main(String[] args) {
        nhapDS();
        System.out.println("\n\t\tDANH SACH VUA NHAP LA");
        xuatDS();

        System.out.println("\n\t\tTAM GIAC CAN CO DIEN TICH LON NHAT LA");
        TamGiacCan.inTieuDe();
        dienTichMax().xuat();

        System.out.println("\n\t\tTAM GIAC CAN CO DIEN TICH NHO NHAT LA");
        TamGiacCan.inTieuDe();
        dienTichMin().xuat();
    }
}
