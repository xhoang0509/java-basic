/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_tap_1;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class NgayThang {

    private int ngay; // 1-31
    private int thang; // 1-12
    private int nam;

    public String toString() {
        return ngay + " / " + thang + " / " + nam;
    }

    public void nhap() {
        System.out.println("Nhap ngay, thang, nam: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // ngay
        int t = s.nextInt(); // thang
        int na = s.nextInt(); // nam
        kiemTra(n, t, na);
    }

    private void kiemTra(int ngay1, int thang1, int nam1) {
        if (0 < thang1 && thang1 <= 12) {
            this.thang = thang1;
        } else {
            this.thang = 1;
            System.out.println("Thang " + thang1 + "khong hop le. dat ngay ngay = 1");
        }

        this.nam = nam1; // neu nam hop le
        ngay = checkNgay(ngay1);
        System.out.println("in thong tin ngay thang " + toString());
    }

    private int checkNgay(int ngayKiemTra) {
        int ngayTrongThang[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // kiem tra thang neu trong toang tu 1-12
        if (ngayKiemTra > 0 && ngayKiemTra <= ngayTrongThang[thang]) {
            return ngayKiemTra;
        } else {
            // kiem tra nam nhuan
            if ((thang == 2) && (ngayKiemTra == 29) && ((nam % 400 == 0) || (nam % 4 == 0) || (nam % 100 != 0))) {
                return ngayKiemTra;
            } else {
                System.out.println("Ngay " + ngayKiemTra + " khong hop le dat lai ngay = 1");
                return 1;
            }
        }
    }

}
