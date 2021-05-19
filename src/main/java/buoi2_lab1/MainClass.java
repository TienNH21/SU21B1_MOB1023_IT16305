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
public class MainClass {
    public static void main(String[] args) {
        SanPhamDAOInterface qlsp = new SanPhamDAO();
        
        // menu
        String tenSP = "A";
        int gia = 1;
        
        SanPham sp = new SanPhamKhongThue(tenSP, gia);
        qlsp.them(sp);
    }
}
