/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật 1: ");
        double dai1 = sc.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật 1: ");
        double rong1 = sc.nextDouble();

        System.out.print("Nhập chiều dài hình chữ nhật 2: ");
        double dai2 = sc.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật 2: ");
        double rong2 = sc.nextDouble();

        System.out.print("Nhập cạnh hình vuông: ");
        double canh = sc.nextDouble();

        ChuNhat cn1 = new ChuNhat(dai1, rong1);
        ChuNhat cn2 = new ChuNhat(dai2, rong2);
        ChuNhat vu = new Vuong(canh); // dùng kiểu cha để chứa đối tượng con

        System.out.println("\n--- THÔNG TIN HÌNH CHỮ NHẬT 1 ---");
        cn1.xuat();

        System.out.println("\n--- THÔNG TIN HÌNH CHỮ NHẬT 2 ---");
        cn2.xuat();

        System.out.println("\n--- THÔNG TIN HÌNH VUÔNG ---");
        vu.xuat();
    }
}
