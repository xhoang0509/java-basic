
package baiitoanquanlyphonghoc;

import java.util.Scanner;


public class PhongHocLyThuyet extends PhongHoc{
    private int soMayChieu;

    public int getSoMayChieu() {
        return soMayChieu;
    }

    public void setSoMayChieu(int soMayChieu) throws Exception {
        if(soMayChieu < 0) throw new Exception("So may chieu nho hon khong");
        this.soMayChieu = soMayChieu;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    
    public PhongHocLyThuyet(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }

    public PhongHocLyThuyet(int soMayChieu, String maPhong, String dayNha, float dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayChieu = soMayChieu;
    }

    public PhongHocLyThuyet() {
    }
    
    @Override
    public Boolean checkStandard(){
        int soBongMin = (int)(dienTich/10);
       if(soBongDen >= soBongMin && soMayChieu > 0){
           return true;
       }
       return false;
    }

    @Override
    public void nhap() throws Exception  {
        super.nhap(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhao so may chieu: ");
        setSoMayChieu(sc.nextInt());
    }

    @Override
    public String toString() {
        return "PhongHocLyThuyet{" + "soMayChieu=" + soMayChieu + '}';
    }
    
}
