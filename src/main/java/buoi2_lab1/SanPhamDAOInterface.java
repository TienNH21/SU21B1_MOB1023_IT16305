/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2_lab1;

import java.util.ArrayList;

/**
 *
 * @author tiennh
 */
public interface SanPhamDAOInterface {
    public void them(SanPham sp);
    public void xoa(int viTri);
    public SanPham select(int viTri);
    public ArrayList<SanPham> xuatDanhSach();
}
