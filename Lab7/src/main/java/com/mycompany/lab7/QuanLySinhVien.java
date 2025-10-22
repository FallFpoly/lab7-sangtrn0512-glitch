/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author sang
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {

    private ArrayList<SinhVienPoly> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhap() {
        while (true) {
            System.out.print("Nhập loại sinh viên (IT/Biz)? ");
            String loai = sc.nextLine();

            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();

            if (loai.equalsIgnoreCase("IT")) {
                System.out.print("Điểm Java: ");
                double java = sc.nextDouble();
                System.out.print("Điểm HTML: ");
                double html = sc.nextDouble();
                System.out.print("Điểm CSS: ");
                double css = sc.nextDouble();
                sc.nextLine();

                list.add(new SinhVienIT(hoTen, java, html, css));

            } else if (loai.equalsIgnoreCase("Biz")) {
                System.out.print("Điểm Marketing: ");
                double mkt = sc.nextDouble();
                System.out.print("Điểm Sales: ");
                double sales = sc.nextDouble();
                sc.nextLine();

                list.add(new SinhVienBiz(hoTen, mkt, sales));

            } else {
                System.out.println("Loại sinh viên không hợp lệ!");
            }

            System.out.print("Nhập thêm sinh viên khác? (Y/N): ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuat() {
        for (SinhVienPoly sv : list) {
            System.out.println("------------------");
            sv.xuat();
        }
    }

    public void xuatSVGioi() {
        System.out.println("=== DANH SÁCH SINH VIÊN GIỎI ===");
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
                sv.xuat();
                System.out.println("------------------");
            }
        }
    }

    public void sapXepTheoDiem() {
        Collections.sort(list, new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return Double.compare(o2.getDiem(), o1.getDiem()); // giảm dần
            }
        });
        System.out.println("Đã sắp xếp danh sách theo điểm giảm dần!");
    }

    public void menu() {
        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Xuất sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 ->
                    nhap();
                case 2 ->
                    xuat();
                case 3 ->
                    xuatSVGioi();
                case 4 ->
                    sapXepTheoDiem();
                case 5 -> {
                    System.out.println("Kết thúc chương trình!");
                    return;
                }
                default ->
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

}
