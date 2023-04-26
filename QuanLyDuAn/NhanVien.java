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
        System.out.print("Nhap ma NV ghi hoa don giao dich: " );
        maNV = new Scanner(System.in).nextLine();
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.println("\n\t\tLich su thong tin giao dich: ");
        System.out.println("\nMaNV ghi hoa don: "+ maNV);
        super.xuat();
        System.out.println("PhongBan: "+ phongBan);
        System.out.println("");

    }
}
