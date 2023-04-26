package QuanLyDuAn;

import java.util.Scanner;

public class KhachHang extends Nguoi {
    private String maGD;
    private String muaH;
    private int soLuong;
    private int gia;

    public KhachHang() {
    }

    public KhachHang(String maGD, String muaH, int soLuong, int gia) {
        this.maGD = maGD;
        this.muaH = muaH;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public KhachHang(String ten, String gioiTinh, String maGD,
                     String muaH, int  soLuong, int gia) {
        super(ten, gioiTinh);
        this.maGD = maGD;
        this.muaH = muaH;
        this.soLuong = soLuong;
        this.gia = gia;
    }
    public float thanhTien(){
        return soLuong * gia;
    }

    public String getMaKH() {
        return maGD;
    }

    public void setMaKH(String maGD) {
        this.maGD = maGD;
    }

    public String getMuaH() {
        return muaH;
    }

    public void setMuaH(String muaH) {
        this.muaH = muaH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public void nhap() {
        System.out.print("Nhap ma giao dich don hang: ");
        maGD = new Scanner(System.in).nextLine();
        super.nhap();
        System.out.print("Nhap san pham khach hang da mua: ");
        muaH = new Scanner(System.in).nextLine();
        System.out.print("Nhap so luong san pham: ");
        soLuong = new Scanner(System.in).nextInt();
        System.out.print("Nhap gia san pham: ");
        gia = new Scanner(System.in).nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("\nMa khach hang: "+ maGD+ "" +
                "       Mua sp: "+ muaH+
                "       So luong: " + soLuong+
            "           Gia: " + gia +" $"    +
                "       Thanh tien: "+ thanhTien()+ " $");
        System.out.println("_________________________");
    }
}
