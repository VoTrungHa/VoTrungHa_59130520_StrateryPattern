/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Date; 
/**
 *
 * @author hp-pc
 */
public class SinhVien {
    private String HoTen;
    private String NgaySinh;
    private float DiemTB;

    public SinhVien(String HoTen, String NgaySinh, float DiemTB) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiemTB = DiemTB;
    }

    
    public String getHoTen() {
        return HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setDiemTB(float DiemTB) {
        this.DiemTB = DiemTB;
    }

    @Override
    public String toString() {
        return  "Họ Tên SV: "+HoTen+"\n"+
                "Ngày Sinh: "+NgaySinh+"\n"+
                "Điểm TB: "+DiemTB; 
                } 
}
