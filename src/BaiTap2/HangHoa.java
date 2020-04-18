/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author hp-pc
 */
public class HangHoa {
    
    private String TenHH;
    private int Gia;
    private String Mota;

    public HangHoa(String TenHH, int Gia, String Mota) {
        this.TenHH = TenHH;
        this.Gia = Gia;
        this.Mota = Mota;
    } 
    public String getTenHH() {
        return TenHH;
    }

    public int getGia() {
        return Gia;
    }

    public String getMota() {
        return Mota;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    @Override
    public String toString() {
        return "Tên Hàng Hòa: "+TenHH+"\n"+
               "Giá: "+Gia+"\n"+
               "Mô Tả: "+Mota+"\n";
    }
    
    
}
