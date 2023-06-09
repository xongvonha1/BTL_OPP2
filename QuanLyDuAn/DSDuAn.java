package QuanLyDuAn;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    public void themDSDA(){
        SanPham sp = new SanPham();
        NhaCungCap ncc = new NhaCungCap();
        sp.nhap();
        ncc.nhap();
        this.list.add(sp);
        this.list.add(ncc);
    }
    public void themDSHD(){
        NhanVien nv = new NhanVien();
        KhachHang kh = new KhachHang();
        nv.nhap();
        kh.nhap();
        DS.add(nv);
        DS.add(kh);
    }
    public int soLuongDSDA(){
        return this.list.size();
    }
    public void tongChiPhiDA(){
        float sum = 0;
        for(DuAn sp: list){
            if( sp instanceof SanPham){
                sum+=((SanPham) sp).ThanhTien();
            }
        }
        System.out.println("Tong chi cua cac du an trong danh sach la: "+ sum+ " $ \n\n");
    }
    public void sapXepDAGGiamDan(){
        Collections.sort(this.list,
                new Comparator<DuAn>() {

                    @Override
                    public int compare( DuAn sp1, DuAn sp2) {
                        if(((SanPham)sp1).ThanhTien()==((SanPham)sp2).ThanhTien()){
                            return 0;
                        }
                        else if (((SanPham)sp1).ThanhTien()>((SanPham)sp2).ThanhTien()){
                            return 1;
                        }
                        else {return -1;}

                    }
                });
        xuatDS();
    }
    public void  LuuFileDSDA() throws FileNotFoundException, IOException {
        File f = new File("DSDA.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(list);
        objout.close();
        fout.close();
        System.out.println("\nLuu file thanh cong: ");
    }
    public void DocFileDSDA() throws FileNotFoundException, IOException, ClassNotFoundException {
        File f =new File("DSDA.dat");

        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        list = new ArrayList<DuAn>();
        list = (ArrayList)objin.readObject();
        objin.close();
        System.out.println("\nDoc file thanh cong.");
    }


}
