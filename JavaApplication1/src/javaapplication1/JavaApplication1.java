/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ABu_Alkhel
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Integer []a1={2,1,1};
       Integer []a2={2,1,1};
         Integer []a3={5,11,1};
        Generic.equalityArrays2(a1, a2);
        System.out.println("---------------------");
        Generic.equalityArrays2(a3, a2);
    }
    
}
