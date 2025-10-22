/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author sang
 */
public class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("Chiều dài: " + dai);
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Diện tích: " + getDienTich());
    }
}
