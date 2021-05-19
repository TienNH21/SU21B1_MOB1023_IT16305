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
public class MainClass {
    public static void main(String[] args) {
        // Khai báo đối tượng
        QuanLyInterface ql;

        // Khởi tạo đối tượng
        ql = new QuanLyNguoi(); 
        SinhVien sv = new SinhVien();

        ql.them(sv);
    }
}
