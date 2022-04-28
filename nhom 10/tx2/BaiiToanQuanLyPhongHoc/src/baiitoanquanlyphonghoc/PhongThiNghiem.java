package baiitoanquanlyphonghoc;
import java.util.Scanner;
public class PhongThiNghiem extends PhongHoc {

    public String chuyenNganh;
    public int sucChua;
    public int soLuongBonRua;

    public PhongThiNghiem(String chuyenNganh, int sucChua, int soLuongBonRua) {
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.soLuongBonRua = soLuongBonRua;
    }

    public PhongThiNghiem(String chuyenNganh, int sucChua, int soLuongBonRua, String maPhong, String dayNha, float dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.soLuongBonRua = soLuongBonRua;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setSucChua(int sucChua) throws Exception {
        if(sucChua < 0) throw new Exception("suc chua nho hon khong");
        this.sucChua = sucChua;
    }

    public void setSoLuongBonRua(int soLuongBonRua) throws Exception {
        if(soLuongBonRua < 0) throw new Exception("so luong bon rua nho hon khong");
        this.soLuongBonRua = soLuongBonRua;
    }

    
    public PhongThiNghiem() {
    }

    @Override
    public void nhap() throws Exception {
        super.nhap(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen nganh: ");
        setChuyenNganh(sc.nextLine());
        System.out.println("Nhap suc chua: ");
        setSucChua(sc.nextInt());
        System.out.println("Nhap so luong bon rua: ");
        setSoLuongBonRua(sc.nextInt());
    }

    
    @Override
    public Boolean checkStandard() {
        int soBongMin = (int) (dienTich / 10);
        if (soLuongBonRua > 0 && soBongDen > soBongMin) {
            return true;
        }
        return false;
    }
}
