/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author hp-pc
 */
public class Chia implements Tinh{

    @Override
    public float tinh(float a, float b) {
        float chia=0;
        try {
            if(b==0)
            {
               throw new ArithmeticException("Không thể chia cho 0 !");
            }
            else
            {
                chia= a/b;  
            } 
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); 
        } 
        return chia;
    }
    
}
