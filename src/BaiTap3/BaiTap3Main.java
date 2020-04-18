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
       qlsv.dsSv.add(new SinhVien("Trung Ha", "01/01/1999", 8));
       qlsv.Inds();
       
    }
    
}
