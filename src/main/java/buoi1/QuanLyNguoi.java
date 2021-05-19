/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.ArrayList;

/**
 *
 * @author tiennh
 */
public class QuanLyNguoi implements QuanLyInterface {
    private ArrayList<Nguoi> danhSach;
    
    public QuanLyNguoi() {
        this.danhSach = new ArrayList<>();
    }
    
    @Override
    public void them(Nguoi nguoi) {
        this.danhSach.add(nguoi);
    }
    
    @Override
    public boolean xoa(int viTri)
    {
        this.danhSach.remove(viTri);
        return true;
    }

    @Override
    public ArrayList<Nguoi> xuatDanhSach()
    {
        return this.danhSach;
    }

    @Override
    public void taoDoiTuongAo() {
        SinhVien sv1 = new SinhVien("PH12321", "UDPM", "Nguyen Van A", 1, "HN"),
            sv2 = new SinhVien("PH12324", "TKTW", "Tran Van B", 1, "HN"),
            sv3 = new SinhVien("PH12331", "LTMT", "Nguyen Thi C", 0, "HN");
        
        this.danhSach.add(sv1);
        this.danhSach.add(sv2);
        this.danhSach.add(sv3);
    }
}
