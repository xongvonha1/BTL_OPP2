package QuanLyDuAn;

import java.util.Scanner;

public class DuAn {
    protected String maDA;

    public DuAn(String maDA) {
        this.maDA = maDA;
    }

    public DuAn() {
    }

    public void nhap(){
        System.out.print("Nhập mã dự án: ");
        this.maDA = new Scanner(System.in).nextLine();
    }
    public void xuat(){
        System.out.println("\n\t\t\t Thong tin du an ");
        System.out.println("MaDuAn: "+  maDA);
    }

}
