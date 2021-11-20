/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arayuz;
import java.util.ArrayList;
/**
 *
 * @author ASametYildirim
 */



public class buyruklar {
    
    /*
private static int linearSearch(String[] liste, String arananSayi) { //linearSearch metotumuz

        for (int i = 0; i <liste.length; i++) { //döngümüz dizimizin uzunluğu kadar dönüyor
            if(liste[i] == arananSayi){ //sırası ile tüm elemanlara bakıyourz
                return i; //eğer aradığımız elemanı bulduysak index'ini geri gönderiyoruz
            }
        }
        return -1; //Herhangi  bir değer bulunamadıysa -1 dönderiyoruz
    }
*/
   
    
    private static void convertStringToHex(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            String charToHex = Integer.toHexString(c);
            stringBuilder.append(charToHex);
        }
    }
    
    public int buyrukKontrol(String arananBuyruk){
        
        
     
    
    String buyruklar[] = {"OR","AND","XOR","ADD","LDA","STA","BUN","BSA","ISZ","CLA","SZA","SNA","CMA","INC","ASHR","ASHL","SZE","HLT","INP","Push","Pop","SZEmpty","SZFull","ORG","END","DEC","HEX"};
      

        for(int i=0; i< buyruklar.length; i++){
            
/*
             System.out.println(buyruklar[i]+"=="+arananBuyruk+"\n" );
            System.out.println(buyruklar[i].valueOf(1)+"=="+arananBuyruk.valueOf(1) );
            */
            
            
            
            
            
            
            String ikinci = buyruklar[i];
            
            
            if(ikinci.equals(arananBuyruk)){
               return 1;
            }
            
            
            /*
            if(ikinci == arananBuyruk){
             System.out.println("####################"+arananBuyruk);
             return 1;
            
            }
                */
        }
        
         return 0;
    /*
     int sayiIndex = linearSearch(boslukparcalama[0],buyruklar); //linearSearch methoduna dizimizi ve aradığımız sayıyı gönderiyoruz
        if(sayiIndex != -1){
            
        }*/
        
        
        

    
    }
}
