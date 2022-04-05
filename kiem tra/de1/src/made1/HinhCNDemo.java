/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package made1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author XuanHoang
 */
public class HinhCNDemo {

    static ArrayList<HinhCN> dsCN = new ArrayList<HinhCN>();
    static int n = 10;

    static boolean checkMaHinh(HinhCN x) {
        for (HinhCN hinhCN : dsCN) {
            if (hinhCN.equals(x)) {
                return true;
            }
        }
        return false;
    }

    static void nhapds() {

        for (int i = 0; i < n; i++) {

            HinhCN temp = new HinhCN();
            while (true) {
                temp.nhap();
                if (!checkMaHinh(temp)) {
                    dsCN.add(temp);
                    System.out.println("Nhap ma hinh thanh cong !");
                    break;
                } else {
                    System.out.println("=> Ma da ton tai, dang nhap lai");
                }
            }

        }
    }

    static void xuatds() {
        HinhCN.inTieuDe();
        for (HinhCN hinhCN : dsCN) {
            hinhCN.xuat();
        }
    }

    static HinhCN dienTichMax() {
        HinhCN max = Collections.max(dsCN, new Comparator<HinhCN>() {
            @Override
            public int compare(HinhCN o1, HinhCN o2) {
                return o1.tinhDT() - o2.tinhDT();
            }            
        });
        return max;
    }
    
    static HinhCN dienTichMin() {
        HinhCN min = Collections.min(dsCN, new Comparator<HinhCN>() {
            @Override
            public int compare(HinhCN o1, HinhCN o2) {
                return o1.tinhDT() - o2.tinhDT();
            }            
        });
        return min;
    }
    
    static void sapXepMaHinh() {
        Collections.sort(dsCN, (HinhCN o1, HinhCN o2) -> o1.getMaHinh().compareTo(o2.getMaHinh()));
        
        System.out.println("\n\t\tDANH SACH SAP XEP THEO MA LA");
        HinhCN.inTieuDe();
        xuatds();
    }

    public static void main(String[] args) {
        nhapds();
        System.out.println("\n\t\tDANH SACH VUA NHAP LA");
        xuatds();
        
        System.out.println("\n\t\tHINH CHU NHAT CO DIEN TICH LON NHAT LA");
        HinhCN.inTieuDe();
        dienTichMax().xuat();
        
        System.out.println("\n\t\tHINH CHU NHAT CO DIEN TICH NHO NHAT LA");
        HinhCN.inTieuDe();
        dienTichMin().xuat();
        
        sapXepMaHinh();
    }

}
