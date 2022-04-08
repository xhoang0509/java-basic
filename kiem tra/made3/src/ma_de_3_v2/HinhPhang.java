/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma_de_3_v2;

/**
 *
 * @author XuanHoang
 */
public abstract class HinhPhang {

    abstract int tinhCV();

    abstract float tinhDT();

    @Override
    public String toString() {
        return "HinhPhang{"
                + " tinhCV=" + tinhCV()
                + " tinhDT=" + tinhDT()
                + '}';
    }

}
