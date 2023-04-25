package QuanLyDuAn;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    private String maNV;
    public static String phongBan = "Phong Ke toan - IT " ;

    public NhanVien() {
    }

    public NhanVien(String maNV) {
        this.maNV = maNV;
    }

    public NhanVien(String ten, String gioiTinh, String maNV) {
        super(ten, gioiTinh);
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap ma NV: " );
        maNV = new Scanner(System.in).nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("MaNV: "+ maNV
                +"PhongBan: "+ phongBan );
    }
}
