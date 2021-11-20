/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic_operations;

/**
 *
 * @author ASametYildirim
 */
public class basic_operators {
    
    public static int AND(int number1, int number2){
         if(number1 ==1 &&  number2 == 1){
             return 1;
         }else{
             return 0;
         }
    }
    
   
    public static int OR(int number1, int number2){
              if(number1 == 0 && number2 == 0){
             return 0;
         }else{
             return 1;
         }
    }
    
    public int XOR (int number1, int number2){
        if(number1 == number2){
            return 0;
        }else{
            return 1;
        }
    }
    
    public int NOT(int number1){
        if(number1 == 1){
            return 0;
        }else{
            return 1;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int AND2 (int x , int y){
        if (y== 1 && x== 1){
            return 1;
        }else {
        return 0;
        }
        
    }
    
   
    
    
    
    
    
    
    
    
    
}
