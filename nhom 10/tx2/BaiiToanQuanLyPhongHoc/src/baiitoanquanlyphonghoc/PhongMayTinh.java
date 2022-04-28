
package baiitoanquanlyphonghoc;

import java.util.Scanner;

public class PhongMayTinh extends PhongHoc{
    private int soMayTinh;

    
    public PhongMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    public PhongMayTinh(int soMayTinh, String maPhong, String dayNha, float dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) throws Exception {
        if(soMayTinh < 0) throw new Exception("so may tinh nho hon khong");
        this.soMayTinh = soMayTinh;
    }

    

    public PhongMayTinh() {
    }

    @Override
    public void nhap() throws Exception {
        super.nhap(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so may tinh: ");
        setSoMayTinh(sc.nextInt());
    }

    
    @Override
    public Boolean checkStandard() {
        int soBongMin = (int)(dienTich/10);
        int soMayTinhMin =(int) (dienTich/1.5f);
        if(soMayTinh > soMayTinhMin && soBongDen > soBongMin){
            return true;
        }
        return false;
    }
}
