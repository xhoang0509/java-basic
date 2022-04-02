/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author XuanHoang
 */
public class NhanVienDemo {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        
        System.out.println("\n\t\tNHAP THONG TIN NV 1");
        nv1.nhap();
        
        System.out.println("\n\t\tNHAP THONG TIN NV 2");
        nv2.nhap();
        
        System.out.println("\n\t\tDANH SACH NV VUA NHAP LA");
        NhanVien.inTieuDe();
        nv1.xuat();
        nv2.xuat();
    }
}
