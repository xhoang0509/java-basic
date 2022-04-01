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
public class DoanhNghiep {

    private String tenDn;
    private String soDt;
    private String diaChi;
    
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten doanh nghiep: ");
        tenDn = s.nextLine();
        System.out.println("Nhap so dien thoai: ");
        soDt = s.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = s.nextLine();
    }
    
    @Override
    public String toString() {
        return "(" + tenDn + " , " + soDt + " , " + diaChi + ")";
    }
}
