package QuanLyDuAn;

import java.util.Scanner;

public class KhachHang extends Nguoi {
    private String maKH;
    private String muaH;
    private int soLuong;
    private int gia;

    public KhachHang() {
    }

    public KhachHang(String maKH, String muaH, int soLuong, int gia) {
        this.maKH = maKH;
        this.muaH = muaH;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public KhachHang(String ten, String gioiTinh, String maKH,
                     String muaH, int  soLuong, int gia) {
        super(ten, gioiTinh);
        this.maKH = maKH;
        this.muaH = muaH;
        this.soLuong = soLuong;
        this.gia = gia;
    }
    public float thanhTien(){
        return soLuong * gia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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
        super.nhap();
        System.out.println(" ");
        maKH = new Scanner(System.in).nextLine();
        System.out.println(" ");
        muaH = new Scanner(System.in).nextLine();
        System.out.println(" ");
        soLuong = new Scanner(System.in).nextInt();
        System.out.println(" ");
        gia = new Scanner(System.in).nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ma khach hang: "+ maKH+ "" +
                "       Mua sp: "+ muaH+
                "       So luong: " + soLuong+
            "           Gia: " + gia +" $"    );
        System.out.println("_________________________");
    }
}
