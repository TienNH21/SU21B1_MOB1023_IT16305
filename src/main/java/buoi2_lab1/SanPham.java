/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2_lab1;

/**
 *
 * @author tiennh
 */
public class SanPham {
    private String ten;
    private int gia;

    public SanPham() {
    }

    public SanPham(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    public double tinhThue()
    {
        return this.gia * 0.1;
    }
}
