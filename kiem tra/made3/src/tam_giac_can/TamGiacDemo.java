/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tam_giac_can;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author XuanHoang
 */
public class TamGiacDemo {

    static ArrayList<TamGiacCan> dsTGC = new ArrayList<TamGiacCan>();
    static int n = 7;

    static boolean checkMa(TamGiacCan x) {
        for (TamGiacCan tamGiacCan : dsTGC) {
            if (tamGiacCan.equals(x)) {
                return true;
            }
        }
        return false;
    }

    static void nhap() {
//        dsTGC = new TamGiacCan[n];
        for (int i = 0; i < n; i++) {
//            dsTGC[i] = new TamGiacCan();
            // kiem tra ma hinh da ton tai chua
            // neu trung nhap lai
            TamGiacCan x = new TamGiacCan();

            while (true) {
                x.input();
                if (!checkMa(x)) {
                    dsTGC.add(x);
                    break;
                } else {
                    System.out.println("Ma da ton tai. Xin nhap lai !");
                }
            }
        }
    }

    static void xuat() {
//        for (int i = 0; i < n; i++) {
//            dsTGC[i].output();
//        }
        for (TamGiacCan tamGiacCan : dsTGC) {
            tamGiacCan.output();
        }
    }

    static TamGiacCan dienTichLonNhat() {
//        
//        float dtMax = dsTGC[0].tinhDT();
//        int index = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (dtMax < dsTGC[i].tinhDT()) {
//                dtMax = dsTGC[i].tinhDT();
//            }
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            if (dtMax == dsTGC[i].tinhDT()) {
//                index = i;
//            }
//        }
//
//        System.out.println("\n\t\tTAM GIAC CO DIEN TICH LON NHAT LA ");
//        TamGiacCan.inTieuDe();
//        dsTGC[index].output();

        TamGiacCan max = Collections.max(dsTGC, new Comparator<TamGiacCan>() {
            @Override
            public int compare(TamGiacCan o1, TamGiacCan o2) {
                return (int) (o1.tinhDT() - o2.tinhDT());
            }
        });

        return max;
    }

    static void sapXepTheoMa() {        

        Collections.sort(dsTGC, new Comparator<TamGiacCan>() {
            @Override
            public int compare(TamGiacCan o1, TamGiacCan o2) {
                return o1.getMaHinh().compareTo(o2.getMaHinh());
            }

        });

        System.out.println("\n\t\tDANH SACH SAP XEP THEO MA LA ");
        TamGiacCan.inTieuDe();
        xuat();
    }

    public static void main(String[] args) {
        nhap();
        System.out.println("\n\tDANH SACH 7 TAM GIAC CAN LA");
        TamGiacCan.inTieuDe();
        xuat();
//        Random rd = new Random();
//        System.out.println(rd.nextInt(100) + 1);

        System.out.println("Dien tich lon nhat la: " );
        TamGiacCan.inTieuDe();        
        dienTichLonNhat().output();
        
        System.out.println("DANH SACH SAP XEP THEO MA LA: " );
        TamGiacCan.inTieuDe();
        sapXepTheoMa();
    }

}
