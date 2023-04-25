package QuanLyDuAn;

import java.util.Scanner;

public class Nguoi {
    protected String ten;
    protected String gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String ten, String gioiTinh) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }
    public void nhap(){
        System.out.println("Nhap ho ten ");
        ten = new Scanner(System.in).nextLine();
        System.out.println("Nhap gioi tinh:  ");
        gioiTinh = new Scanner(System.in).nextLine();
    }
    public void xuat(){
        System.out.println("Ho va Ten: "+ ten+
                "\nGiơi tính: "+ gioiTinh);
    }
}
