/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaGiac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javafx.print.Collation;

/**
 *
 * @author XuanHoang
 */
public class Demo {

    static List<HinhVuong> dsHV = new ArrayList<HinhVuong>();
    static int n = 3;

    // kiem tra ma hinh da ton tai chua
    static boolean checkMaHinh(HinhVuong x) {
        for (HinhVuong hinhVuong : dsHV) {
            if (hinhVuong.equals(x.getMaHinh())) {
                return false;
            }
        }
        return true;
    }

    static void nhapDS() {
        for (int i = 0; i < n; i++) {
            HinhVuong temp = new HinhVuong();

            while (true) {
                temp.nhapDL();
                if (checkMaHinh(temp)) {
                    System.out.println("Nhap thanh cong !");
                    dsHV.add(temp);
                    break;
                } else {
                    System.out.println("Ma hinh da ton tai, xin nhap lai !!!");
                }
            }
        }
    }

    static void xuatDS() {
        HinhVuong.inTieuDe();
        for (HinhVuong hinhVuong : dsHV) {
            hinhVuong.xuat();
        }
        System.out.println("");
    }

    static void suaDS() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma hinh can sua: ");
        String tempMa = s.nextLine();
        int indexFinded = -1;

        for (int i = 0; i < n; i++) {
            if (dsHV.get(i).equals(tempMa)) {
                indexFinded = i;
            }
        }

        // tim thay
        if (indexFinded >= 0) {
            System.out.println("Sua thong tin ma hinh " + tempMa);
            HinhVuong temp = new HinhVuong();

            while (true) {
                temp.nhapDL();
                if (checkMaHinh(temp)) {
                    System.out.println("Sua thanh cong !!!");
                    dsHV.set(indexFinded, temp);
                    break;
                } else {
                    System.out.println("Ma hinh da ton tai, xin nhap lai !!!");
                }
            }

            System.out.println("\n\t\tDANH SACH SAU KHI SUA LA");
            xuatDS();
        } // khong tim thay
        else {
            System.out.println("Khong tim thay ma hinh");
        }

    }

    static HinhVuong chuViMax() {
        HinhVuong temp = Collections.max(dsHV, new Comparator<HinhVuong>() {
            @Override
            public int compare(HinhVuong o1, HinhVuong o2) {
                return (int) (o1.tinhCV() - o2.tinhCV());
            }
        });
        return temp;
    }

    static void sapXepMaHinh() {
        Collections.sort(dsHV, new Comparator<HinhVuong>() {
            @Override
            public int compare(HinhVuong o1, HinhVuong o2) {
                return o1.getMaHinh().compareTo(o2.getMaHinh());
            }
        });
    }

    public static void main(String[] args) {
        nhapDS();
        System.out.println("\n\t\tDANH SACH VUA NHAP LA");
        xuatDS();

        suaDS();

        System.out.println("\n\t\tHINH VUONG CO CHU VI LON NHAN LA");
        HinhVuong.inTieuDe();
        chuViMax().xuat();

        sapXepMaHinh();
        System.out.println("\n\t\tDANH SACH SAU KHI SAP XEP THEO MA HINH LA");
        xuatDS();

    }
}
