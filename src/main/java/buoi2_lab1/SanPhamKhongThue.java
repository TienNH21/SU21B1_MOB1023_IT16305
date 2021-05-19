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
public class SanPhamKhongThue extends SanPham {

    public SanPhamKhongThue(String ten, int gia) {
        super(ten, gia);
    }
    
    @Override
    public double tinhThue()
    {
        return 0;
    }
}
