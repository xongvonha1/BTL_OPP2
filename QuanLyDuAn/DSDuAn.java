package QuanLyDuAn;

import java.util.ArrayList;
import java.util.Scanner;

public class DSDuAn {
    private ArrayList<DuAn> list ;

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

}
