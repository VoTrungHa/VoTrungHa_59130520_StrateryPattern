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
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         GioHang giohang1=new GioHang();
         giohang1.dsHH.add(new HangHoa("Sửa Tươi",1000000, "sản phẩm từ nga")); 
         giohang1.dsHH.add(new HangHoa("Sửa Tươi",1000000, "sản phẩm từ nga")); 
         giohang1.setHinhthucTT(new ThanhToanOnline());
         System.out.println("==================Thanh Toán Online===================\n");
         System.out.println(giohang1.dsHH.toString()+"Số tiền phải trả: "+giohang1.thanhtoan()+"\n");
        
         GioHang giohang2=new GioHang();
         giohang2.dsHH.add(new HangHoa("Gạo",1000000, "Hàng Việt Nam Chất Lượng Cao")); 
         giohang2.setHinhthucTT(new ThanhToanCOD());
         System.out.println("==================Thanh Toán COD===================\n");
         System.out.println(giohang2.dsHH.toString()+"Số tiền phải trả: "+giohang2.thanhtoan()+"\n");
    }
    
}
