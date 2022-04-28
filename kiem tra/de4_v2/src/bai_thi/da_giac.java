/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_thi;

/**
 *
 * @author XuanHoang
 */
public abstract class da_giac {

    protected String maHinh;
    protected int dsCanh[];

    abstract double tinhCV();

    abstract double tinhDT();

    abstract void nhapDL();

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) throws Exception {
        if(maHinh.isEmpty()) {
            throw new Exception("khong duoc de trong");
        }
        this.maHinh = maHinh;
    }

    public int[] getDsCanh() {
        return dsCanh;
    }

    public void setDsCanh(int[] dsCanh) {
        this.dsCanh = dsCanh;
    }

    
}
