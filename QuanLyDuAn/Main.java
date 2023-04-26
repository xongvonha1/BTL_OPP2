package QuanLyDuAn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("_______MENU_______ ");
        System.out.print(
                "1. Nhap danh sach du an san xuat san pham cua cong ty. \n" +
                "2. Xuat danh sach du an san xuat san pham cua cong ty. \n" +
                "3. Them du an vao. \n" +
                "4. So luong du an trong danh sach. \n" +
                "5. Tong chi phi cac du an trong danh sach. \n" +
                "6. Sắp xếp ds theo thu tu giam dan. \n" + "" +
                "7. Luu danh sach du an vao file. \n" +
                "8. Doc danh sach du an vao file \n " +
                ""+
                "9. Nhap hoa don giao dich khach hang cua cong ty \n" +
                "10. Xuat hoa don giao dich khach hang cua cong ty. \n" +
                "11. Them hoa don giao dich. \n " +
                "" +
                ""+
                "Moi ban chon: " +
                "");
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        DSDuAn p = new DSDuAn();
        int luachon = 0;
//        p.NhapDS();
//        p.xuatDS();
//        p.NhapGD();
//        p.XuatGD();
        do {
            menu();
            luachon = new Scanner(System.in).nextInt();
            if (luachon==1){
                p.NhapDS();
            }
            else if(luachon==2){
                p.xuatDS();
            }
            else if(luachon==3){
                p.themDSDA();
            }
            else if(luachon==4){
                System.out.println("\n____________________");
                System.out.println("\nSo luong du an trong danh sach: "+ p.soLuongDSDA()/2 );
                System.out.println("");
            }
            else if(luachon==5){
                System.out.println("\n_________________________");
                p.tongChiPhiDA();
            }
            else if(luachon==6){
                p.sapXepDAGGiamDan();
            }
            else if(luachon==7){
                p.LuuFileDSDA();
            }
            else if(luachon==8){
                p.DocFileDSDA();
            }
             else if (luachon==9){
                p.NhapGD();
            }
            else if(luachon==10){
                p.XuatGD();
            }
            else if(luachon==5){};

        }while (luachon!=0);
    }
}
