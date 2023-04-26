package QuanLyDuAn;

import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("_______MENU_______ ");
        System.out.print(
                "1. Nhap danh sach du an san xuat san pham cua cong ty. \n" +
                "2. Xuat danh sach du an san xuat san pham cua cong ty. \n" +
                "3. Nhap hoa don giao dich khach hang cua cong ty. \n" +
                "4. Xuat hoa don giao dich khach hang cua cong ty. \n" +
                "" +
                "Moi ban chon: " +
                "");
    }
    public static void main(String[] args) {
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
             else if (luachon==3){
                p.NhapGD();
            }
            else if(luachon==4){
                p.XuatGD();
            };
//            else if(luachon==5){};

        }while (luachon!=0);
    }
}
