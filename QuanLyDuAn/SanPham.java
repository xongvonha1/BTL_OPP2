package QuanLyDuAn;

import java.io.Serializable;
import java.util.Scanner;

public class SanPham extends DuAn implements Serializable {
    public float ThanhTien;
    private String maSP;
    private String tenSP;
    private int  soLuong;
    private float gia;

    public SanPham() {
    }

    public SanPham(String maDA, String maSP, String tenSP,
                   int soLuong, float gia) {
        super(maDA);
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public float ThanhTien(){
        return soLuong * gia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap ma san pham: ");
        this.maSP = new Scanner(System.in).nextLine();
        System.out.print("Nhap ten san pham: ");
        this.tenSP = new Scanner(System.in).nextLine();
        System.out.print("Nhap so luong: ");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.print("Nhap gia sp: ");
        this.gia = new Scanner(System.in).nextFloat();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("MaHH "+  maSP +"   " +
                "     TenHH: " + tenSP +
                "      SoLuong: " +soLuong +
                "      Gia: " + gia +" $" +
                "         Tong: "+ ThanhTien() +" $\n"
        );
    }
}
