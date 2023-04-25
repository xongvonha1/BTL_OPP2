package QuanLyDuAn;

import java.util.ArrayList;
import java.util.Scanner;

public class DSDuAn {
    private ArrayList<DuAn> list ;
    ArrayList<Nguoi> DS= new ArrayList<Nguoi>();

    public DSDuAn() {
        this.list = new ArrayList<DuAn>();
    }

    public DSDuAn(ArrayList<DuAn> list) {
        this.list = list;
    }

    public void NhapDS(){
        System.out.print("Nhap so luong du an: ");
        int n = new Scanner(System.in).nextInt();
        list = new ArrayList<DuAn>();
        for (int i=0; i<n; i++){
            SanPham sp = new SanPham();
            NhaCungCap ncc = new NhaCungCap();
            sp.nhap();
            ncc.nhap();
            list.add(sp);
            list.add(ncc);
        }
    }
    public void xuatDS(){
        for (DuAn d: list
             ) {
            d.xuat();
        }
    }
    public void NhapGD(){
        System.out.print("Nhap so lan khach hang giao dich: ");
        int m = new Scanner(System.in).nextInt();
        DS = new ArrayList<Nguoi>();
        for (int i =0; i<m; i++){
            NhanVien nv = new NhanVien();
            KhachHang kh = new KhachHang();
            nv.nhap();
            kh.nhap();
            DS.add(nv);
            DS.add(kh);
        }
    }
    public void XuatGD(){
        for (Nguoi n : DS
             ) {
            n.xuat();
        }
    }

}
