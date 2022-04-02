/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu1.bai2;

import java.util.Scanner;

/**
 *
 * @author XuanHoang
 */
public class Main {
    static HinhTron hinhTrons[];
    static int n;
    
    static void nhap() {
        System.out.print("Nhap so luong hinh tron: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        hinhTrons = new HinhTron[n];
        
        for (int i = 0; i < n; i++) {
            hinhTrons[i] = new HinhTron();
            hinhTrons[i].nhap();
        }
    }
    
    static void xuat() {
        HinhTron.inTieuDe();
        for (int i = 0; i < n; i++) {
            hinhTrons[i].xuat();
        }
  
    }
    
    public static void main(String[] args) {
        nhap();
        xuat();
    }
}
