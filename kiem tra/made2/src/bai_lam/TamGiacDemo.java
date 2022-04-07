/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_lam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author XuanHoang
 */
public class TamGiacDemo {

    static TamGiac dsTG[];
    static int n = 7;

    static void nhapDS() {
        dsTG = new TamGiac[n];
        for (int i = 0; i < n; i++) {
            dsTG[i] = new TamGiac();
            dsTG[i].nhap();
        }
    }

    static void xuatDS() {
        TamGiac.inTieuDe();
        for (TamGiac tamGiac : dsTG) {
            tamGiac.xuat();
        }
    }

    static TamGiac chuViMax() {
        List<TamGiac> list = Arrays.asList(dsTG);
        TamGiac temp = Collections.max(list, new Comparator<TamGiac>() {
            @Override
            public int compare(TamGiac o1, TamGiac o2) {
                return (int) (o1.tinhCV() - o2.tinhCV());
            }
        });
        
        return temp;
    }
    
    static TamGiac chuViMin() {
        List<TamGiac> list = Arrays.asList(dsTG);
        TamGiac temp = Collections.min(list, new Comparator<TamGiac>() {
            @Override
            public int compare(TamGiac o1, TamGiac o2) {
                return (int) (o1.tinhCV() - o2.tinhCV());
            }
        });
        
        return temp;
    }

    public static void main(String[] args) {
        nhapDS();
        System.out.println("\n\t\tDANH SACH VUA NHAP LA");
        xuatDS();

        System.out.println("\n\t\tTAM GIAC CO CHU VI MAX LA");
        TamGiac.inTieuDe();
        chuViMax().xuat();
        
        System.out.println("\n\t\tTAM GIAC CO CHU VI MIN LA");
        TamGiac.inTieuDe();
        chuViMin().xuat();
    }
}
