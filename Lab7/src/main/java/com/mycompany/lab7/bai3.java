/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        SinhVienPoly sv1 = new SinhVienIT("Nguyễn Văn A", 8.5, 7.5, 9.0);
        SinhVienPoly sv2 = new SinhVienBiz("Trần Thị B", 7.0, 8.0);

        sv1.xuat();
        System.out.println("----------------------");
        sv2.xuat();
    }
}
