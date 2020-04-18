/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author hp-pc
 */
public class GioHang {
    
    IThanhToan hinhthucTT;
    ArrayList<HangHoa> dsHH=new ArrayList<>();
 
    
    public IThanhToan getHinhthucTT() {
        return hinhthucTT;
    }

    public ArrayList<HangHoa> getDsHH() {
        return dsHH;
    }

    public void setHinhthucTT(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }

    public void setDsHH(ArrayList<HangHoa> dsHH) {
        this.dsHH = dsHH;
    }
    public double thanhtoan()
    {
        int tongTien=0;
        for (int i=0;i<dsHH.size();i++) {
            
            tongTien+=dsHH.get(i).getGia();
        }
        return hinhthucTT.thanhtoan(tongTien);
    } 
}
