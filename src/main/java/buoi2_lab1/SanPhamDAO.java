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
public class SanPhamDAO implements SanPhamDAOInterface {
    private ArrayList<SanPham> dssp;
    
    public SanPhamDAO() {
        this.dssp = new ArrayList<SanPham>();
    }

    @Override
    public void them(SanPham sp) {
        this.dssp.add(sp);
    }

    @Override
    public void xoa(int viTri) {
        this.dssp.remove(viTri);
    }

    @Override
    public SanPham select(int viTri) {
        return this.dssp.get(viTri);
    }

    @Override
    public ArrayList<SanPham> xuatDanhSach() {
        return this.dssp;
    }
}
