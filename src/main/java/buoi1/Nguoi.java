/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

/**
 *
 * @author tiennh
 */
public class Nguoi {
    private String hoTen;
    private int gioiTinh;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int gioiTinh, String queQuan) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    @Override
    public String toString()
    {
        return this.hoTen + " - " + this.gioiTinh + " - " + this.queQuan;
    }
}
