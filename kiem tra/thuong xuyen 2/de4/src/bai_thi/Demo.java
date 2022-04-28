/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_thi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author XuanHoang
 */
public class Demo {

    static TreeSet<TamGiac> dsTG = new TreeSet<>(new CompareMaHinh());
    static List<TamGiac> dsTG2 = new ArrayList<>();

    static boolean checkMaHinh(String maHinh) {
        for (TamGiac tamGiac : dsTG) {
            if (tamGiac.getMaHinh().equals(maHinh)) {
                return true;
            }
        }
        return false;
    }

    static void nhapDS() {
        while (true) {
            TamGiac x = new TamGiac();
            x.input();
            if (checkMaHinh(x.getMaHinh())) {
                System.out.println("ma hinh da ton tai, nhap lai");
            } else {
                if (x.getMaHinh().equals("0")) {
                    break;
                } else {
                    dsTG2.add(x);
                }
            }
        }
    }

    static void xuatDS() {
        if (dsTG2.size() > 0) {
            System.out.println("\n\t\tDS tam giac la ");
            TamGiac.inTieuDe();
            for (TamGiac tamGiac : dsTG2) {
                tamGiac.output();
            }
        } else {
            System.out.println("\n\t\tDS trong");
        }
    }

    static void sapXepDS() {
        dsTG.addAll(dsTG2);
        System.out.println("\n\t\tDS sau khi sap xep la");
        TamGiac.inTieuDe();
        for (TamGiac tamGiac : dsTG) {
            tamGiac.output();
        }
    }

    static void themDS() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap nhap hinh moi !");
        TamGiac x = new TamGiac();
        x.input();

        int index;

        while (true) {
            try {
                System.out.print("Nhap vi tri can them 0 - " + dsTG2.size() + ": ");
                index = s.nextInt();
                break;
            } catch (Exception e) {
            }
        }
        do {
            System.out.print("Nhap vi tri can them 0 - " + dsTG2.size() + ": ");
            index = s.nextInt();
            if (index < 0 || index > dsTG2.size()) {
                System.out.println("nhap lai");
            }
        } while (index < 0 || index > dsTG2.size());

        dsTG2 = new ArrayList<>(dsTG);

        dsTG2.add(index, x);
        System.out.println("\n\t\tDS vua them la");
        xuatDS();
    }

    public static void main(String[] args) {
        nhapDS();
        xuatDS();
        sapXepDS();
        themDS();
    }
}
