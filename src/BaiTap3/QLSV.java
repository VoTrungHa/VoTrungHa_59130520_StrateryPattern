/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections; 
import java.util.Comparator;
/**
 *
 * @author hp-pc
 */
public class QLSV {
    
    ArrayList<SinhVien> dsSv=new ArrayList<>();
    ISoSanh<SinhVien> soSanh; 
     
    public ArrayList<SinhVien> getDsSv() {
        return dsSv;
    }

    public void setDsSv(ArrayList<SinhVien> dsSv) {
        this.dsSv = dsSv;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    } 
    public void Sapxep()
    { 
         Collections.sort(dsSv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                 return soSanh.soSanh(sv1, sv2);
            }
        });
    }  
    public void Inds()
    {
        for (SinhVien sinhVien : dsSv) {
            System.out.println(sinhVien+"\n");
        }
    }
    
}
