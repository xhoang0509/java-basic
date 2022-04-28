/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_thi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class Demo {

    static LinkedHashSet<HinhTron> dsHT = new LinkedHashSet<>();

    static boolean checkMaHinh(String maHinh) {
        for (HinhTron hinhTron : dsHT) {
            if (hinhTron.getMaHinh().equals(maHinh)) {
                return true;
            }
        }
        return false;
    }

    static void nhapDS() {
        while (true) {
            HinhTron x = new HinhTron();
            x.input();

            if (x.getBanKinh() == 0) {
                break;
            } else {
                dsHT.add(x);
            }
        }
    }

    static void xuatDS() {
        if (dsHT.size() > 0) {
            System.out.println("\n\t\tDS HT la: ");
            HinhTron.inTieuDe();
            for (HinhTron hinhTron : dsHT) {
                hinhTron.output();
            }
        } else {
            System.out.println("\n\t\tDS trong");
        }
    }

    static void themDS() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma hinh can them: ");
        String maHinh = s.nextLine();

        if (checkMaHinh(maHinh)) {
            System.out.println("Ma hinh da ton tai, khong them duoc");
        } else {
            System.out.print("Nhap ban kinh: ");
            double banKinh = s.nextDouble();
            HinhTron x = new HinhTron(banKinh, maHinh);

            LinkedList<HinhTron> dsHT2 = new LinkedList<>(dsHT);
            dsHT2.addFirst(x);
            // sau khi convert tra lai kieu du lieu
            dsHT = new LinkedHashSet<>(dsHT2);

            System.out.println("\n\t\tDS sau khi them la: ");
            xuatDS();
            
//            HinhTron.inTieuDe();
//            for (HinhTron hinhTron : dsHT2) {
//                hinhTron.output();
//            }
//            
//            dsHT = new LinkedHashSet<>(dsHT2);
        }

    }
    
    // sap xep ds theo ma hinh
    static void sapXepDS() {
        List<HinhTron> dsHT2 = new ArrayList<>(dsHT);
        Collections.sort(dsHT2, new Comparator<HinhTron>() {
            @Override
            public int compare(HinhTron o1, HinhTron o2) {
                return o1.getMaHinh().compareTo(o2.getMaHinh());
            }
        });
        dsHT = new LinkedHashSet<>(dsHT2);
        System.out.println("\n\t\tDS sau khi sap xep theo ma hinh la");
        xuatDS();
        
    }

    public static void main(String[] args) {
        nhapDS();
        xuatDS();
        themDS();
        sapXepDS();
    }
}
