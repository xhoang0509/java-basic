package baiitoanquanlyphonghoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BaiToanQuanLyPhongHoc {

    static ArrayList<PhongHoc> list = new ArrayList<PhongHoc>();
    static int choose;
    static Scanner sc = new Scanner(System.in);

    static Boolean checkMP(String mp) {
        for (PhongHoc phongHoc : list) {
            if (phongHoc.getMaPhong().compareTo(mp) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void findByMaPhong() {
        System.out.print("---->Nhap ma phong can tim: ");
        sc.nextLine();
        String mp = sc.nextLine();
        PhongHoc x = null;

        for (PhongHoc phongHoc : list) {
            if (phongHoc.getMaPhong().compareTo(mp) == 0) {
                x = phongHoc;
            }
        }
        if (x != null) {
            System.out.println(x.toString());
        } else {
            System.out.println("---->khong co ma phong trong list");
        }
    }

    public static void themMoi() throws Exception {
        int luachon;

        while (true) {
            try {
                System.out.println("Nhap lua chon loai phong can nhap:");
                System.out.println("1.Phong Ly thuyet");
                System.out.println("2.Phong Thuc hanh");
                System.out.println("3.Phong May tinh");
                System.out.print("\nLua chon: ");
                int temp = sc.nextInt();
                if (temp < 0 || temp > 3) {
                    throw new Exception("---->ngoai vung chon");
                }
                luachon = temp;
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        switch (luachon) {
            case 1:
                while (true) {
                    PhongHocLyThuyet x = new PhongHocLyThuyet();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
            case 2:
                while (true) {
                    PhongThiNghiem x = new PhongThiNghiem();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
            case 3:
                while (true) {
                    PhongMayTinh x = new PhongMayTinh();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
        }

    }

//  HOANG
    public static void SXTangDanTheoCotDayNha() {
        Collections.sort(list, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return o1.getDayNha().compareTo(o2.getDayNha());
            }

        });
//        Collections.sort(list, (PhongHoc o1, PhongHoc o2) -> o1.getDayNha().compareTo(o2.getDayNha()));

        System.out.println("\n\t\tDS sau khi sap xep tang dan theo day nha");
        for (PhongHoc phongHoc : list) {
            System.out.println(phongHoc.toString());
        }
    }

    public static void SXGiamDanTheoDienTich() {
        Collections.sort(list, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return (int) (o2.getDienTich() - o1.getDienTich());
            }

        });

        System.out.println("\n\t\tDS sau khi sap xep giam dan theo DIEN TICH");
        for (PhongHoc phongHoc : list) {
            System.out.println(phongHoc.toString());
        }
    }

    public static void SXTangDanTheoBongDen() {
        Collections.sort(list, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return (int) (o1.getSoBongDen() - o2.getSoBongDen());
            }

        });

        System.out.println("\n\t\tDS sau khi sap xep tan dan theo BONG DEN");
        for (PhongHoc phongHoc : list) {
            System.out.println(phongHoc.toString());
        }
    }
//    HOANG END

    public static void main(String[] args) {
        list.add(new PhongHocLyThuyet(1, "404", "A9", 45.0f, 7));
        list.add(new PhongThiNghiem("Hoa", 45, 2, "705", "B1", 70.0f, 5));
        list.add(new PhongMayTinh(45, "1004", "A5", 65.0f, 35));
        list.add(new PhongMayTinh(45, "704", "A2", 65.0f, 35));

        while (true) {
            System.out.println("\n\t====\t");
            System.out.println("Lua chon chuc nang");
            System.out.println("1.Them moi phong hoc");
            System.out.println("2. Tìm kiếm phòng học");

//            HOANG
            System.out.println("31. Sap xep DS tang dan theo cot day nha");
            System.out.println("32. Sap xep DS giam dan theo cot dien tich");
            System.out.println("33. Sap xep DS tang dan theo cot so bong den");

            System.out.print("Nhap lua chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    try {
                    themMoi();
                } catch (Exception e) {
                }
                break;
                case 2:
                    findByMaPhong();
                    break;
                case 31:
                    SXTangDanTheoCotDayNha();
                    break;
                case 32:
                    SXGiamDanTheoDienTich();
                    break;
                case 33:
                    SXTangDanTheoBongDen();
                    break;
                default:
                    return;
            }
        }
//        HOANG END
    }

}
