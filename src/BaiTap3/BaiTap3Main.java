/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hp-pc
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        QLSV qlsv=new QLSV();
       qlsv.dsSv.add(new SinhVien("Võ Trung Hà", "01/03/1995", 6));
       qlsv.dsSv.add(new SinhVien("Hoàng Hải", "11/01/1991", 8));
       qlsv.dsSv.add(new SinhVien("Phúc Mạnh Thường", "01/12/1999", 7));
       
        System.out.println("================ Sắp Xếp Theo Tên Sinh Viên ================");
       qlsv.setSoSanh(new SoSanhTheoTen());
       qlsv.Sapxep();
       qlsv.Inds();
       
        System.out.println("================ Sắp Xếp Theo Điểm Sinh Viên ================");
       qlsv.setSoSanh(new SoSanhTheoDiem());
       qlsv.Sapxep();
       qlsv.Inds();
       
    }
    
}
