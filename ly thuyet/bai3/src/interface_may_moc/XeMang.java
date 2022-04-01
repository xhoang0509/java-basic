package interface_may_moc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author XuanHoang
 */
public class XeMang {

    static Xe dsXe[];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============== Quan ly xe == == == == == == ==");
        int chon;
        do {
            System.out.print("1\tNhập danh sách xe\n");
            System.out.print("2\tIn danh sách xe\n");
            System.out.print("3\tTìm kiếm xe có trọng tải max\n");
            System.out.print("4\tXóa xe theo stt\n");
            System.out.print("5\tThoát\n");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timXeTrongTaiMax();
                    break;
                case 4:
                    System.out.print("Nhập số xe cần xóa: ");
                    int stt = sc.nextInt();
                    xoaXe(stt);
                    break;
            }
        } while (chon != 5);
    }

    static void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so luong xe: ");
        n = s.nextInt();
        dsXe = new Xe[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\tNhap thong tin xe: " + (i + 1));
            dsXe[i] = new Xe();
            dsXe[i].nhap();
        }
    }

    static void xuat() {
        Xe.inTieuDe();
        for (Xe xe : dsXe) {
            xe.xuat();
        }
    }

    public static void xoaXe(int stt) {
        if ((stt >= 0) && (stt < n)) {
            for (int i = stt; i < n - 1; i++) {
                dsXe[i] = dsXe[i + 1];
            }
            --n;
        } else {
            System.out.println("Vi tri xe nam ngoai pham vi");
        }
    }

    public static void timXeTrongTaiMax() {
        Comparator<Xe> c = new Comparator<Xe>() {
            @Override
            public int compare(Xe o1, Xe o2) {
                return Float.compare(o1.getTrongTai(), o2.getTrongTai());
            }
        };

        Xe x = Collections.max(Arrays.asList(dsXe), c);
        System.out.println("Danh sach xe co trong tai max = ");
        Xe.inTieuDe();
        float max = x.getTrongTai();
        for (int i = 0; i < n; i++) {
            if (dsXe[i].getTrongTai() == max) {
                dsXe[i].xuat();
            }
        }
    }
}
