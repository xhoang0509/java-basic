/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_thi;

import java.util.Comparator;

/**
 *
 * @author XuanHoang
 */
public class CompareMaHinh implements Comparator<TamGiac>{

    @Override
    public int compare(TamGiac o1, TamGiac o2) {
        return o1.getMaHinh().compareTo(o2.getMaHinh());
    }
    
}
