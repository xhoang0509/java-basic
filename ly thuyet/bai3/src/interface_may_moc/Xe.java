/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_may_moc;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class Xe implements MayMoc {

    private String tenXe;
    private String tenKh;
    private String NL;
    private DoanhNghiep dn = new DoanhNghiep();
    private float trongTai;
    private float tienDatCoc;
    private int namSx;

    public void setNhienLieu(String NL) {
        this.NL = NL;
    }

    public void setNamSx(int namSx) {
        if (namSx > 0) {
            this.namSx = namSx;
        } else {
            this.namSx = 2022;
        }
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten xe: ");
        tenXe = s.nextLine();

        System.out.println("Nhap nhien lieu cua xe: ");
        // phuong thuc ke thua tu MayMoc
        setNhienLieu(s.nextLine());
        System.out.println("Nhap ten khach hang thue xe: ");
        tenKh = s.nextLine();
        System.out.println("Nhap doanh nghiep: ");
        dn.nhap();
        System.out.println("Nhap trong tai: ");
        trongTai = s.nextFloat();
        System.out.println("Nhap so dien dat cong (VND): ");
        tienDatCoc = s.nextFloat();

        // phuong thuc ke thua may moc
        System.out.println("Nhap nam san xuat xe: ");
        setNamSx(s.nextInt());

        // bo qua enter khi nhap so truoc nhap xau
        s.nextLine();
    }

    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s %25s %10s %10s %10s %n",
                " ten xe", "ten kh", " nhien lieu", " Doanh nghiep", " tai trọng", "tien DC", " Nam sx");
    }

    public void xuat() {
        System.out.printf("%15s %15s %15s %25s %10.1f %10.1fs %10d %n",
                tenXe, tenKh, NL, dn, trongTai, tienDatCoc, namSx);
    }

    public float getTrongTai() {
        return trongTai;
    }

}
