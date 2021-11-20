/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic_toogle;
import logic_operations.basic_operators;
import java.io.*;
/**
 *
 * @author ASametYildirim
 */
public class logic_toogle {
    
   basic_operators bo = new basic_operators();

    
    public int[] halfAdder(int number1, int number2){
        int s;
        int c;
        int sonuc;
        
        s = bo.XOR(number1, number2);
        c=  bo.AND(number1, number2);
        
       int[] arr={s,c};
        
      return arr;
       
    }
    
    public int[] fullAdder(int number1, int number2, int number3){
      
        int s;
        int c;
        
        
    int[] sonuc1 =  halfAdder(number1, number2);
    int[] sonuc2 = halfAdder(sonuc1[0], number3);
    int sonuc3 = bo.OR(sonuc2[1], number3);
    
   int[] sonuc = {sonuc2[0],sonuc3};
    return sonuc;
       
       
    } 
    /*
    public int[] binaryAdder(int[] a, int[] b, int c){
        
    }
    */
    /*    int degisken1 =0;
    int degisken2 = 0;
    
    logic_toogle lt = new logic_toogle();
    
    int[] yazdir = lt.halfadder(degisken1,degisken2);
System.out.println(yazdir[0]);
System.out.println(yazdir[1]);*/
    
    
    


    
    
}
