package QuanLyDuAn;

import java.util.Scanner;

public class NhaCungCap extends DuAn{
    private String tenNCC;
    private String diaChi;
    private String sdt;

    public NhaCungCap() {
    }

    public NhaCungCap(String maDA) {
        super(maDA);
    }

    public NhaCungCap(String maDA, String tenNCC, String diaChi, String sdt) {
        super(maDA);
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void nhap(){
        System.out.print("Nhập tên nhà cung cấp: ");
        this.tenNCC = new Scanner(System.in).nextLine();
        System.out.print("Nhập dia chi ncc: ");
        this.diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhập sdt nhà cung cung cấp: ");
        this.sdt = new Scanner(System.in).nextLine();
    }

    @Override
    public void xuat() {
        System.out.println(
                "TenNCC: " + tenNCC +
                        "\nDiaChi: " + diaChi +
                        "\nSDT:  " + sdt+"\n"
        );
        System.out.println("__________________________________");
    }
}
