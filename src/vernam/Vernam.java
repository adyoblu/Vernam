
package vernam;

import java.io.*;
import java.util.*;

public abstract class Vernam {
    
    public String encrypt (String message, int r){
        
            System.out.println(message);  //print message
            char c;
            int l = message.length();
            StringBuilder cipher = new StringBuilder(l);
            int z;      // ultima cifra a numarului 
            int a[] = new int[100];  //vector de key
            int j = 1, b = 0;
            int e = 0, s = 0;
            
            while (r != 0){ 
             if (e == 1 && b == 0){ b = 1; s = 1; }
             b = b * 10 + r % 10;
             r /= 10;
             e++;
            }
            //System.out.println("" + b);
            while (b != 0){     //cat timp nr nu mai are cifre
                 z = b % 10;    //ultima cifra
                 //System.out.print(z);
                 a[j] = z;      
                 j++;            //j-1 -->ultima pozitie ocupata
                 b /= 10;
            }
            if ( s == 1 ) a[j-1] = a[j-1] - 1;  //ultima cifra va fi 0 daca s = 1;
            //for(int i = 1; i < l; i++)
            //System.out.print(" "+a[i]+ " ");
            //System.out.println(" ");
            int k = j-1;
            j = 1;
            for(int i = 0; i < l; i++){
                c = message.charAt(i);
                if(Character.isLetterOrDigit(c)){
                    System.out.print(a[j]);
                    int newc = Character.toUpperCase(c) - 'A';
                    newc = (newc + a[j] ) % 26 + 'A';
                    cipher.append((char)newc);
                    if(j == k) {j = 0; System.out.print(" ");}
                    j++;
                }
                else if(c < 48 || c > 57 && c < 65 || c > 122 && c <= 127 || c < 97 && c > 90){
                    System.out.print(a[j]);
                    int newc = c ;
                    newc = (newc + a[j]) ;
                    cipher.append((char)newc);
                    if(j == k) {j = 0; System.out.print(" ");}
                    j++;
                }
                else {
                    cipher.append(c);
                }
            }
            
            String result = cipher.toString();
            System.out.println("");
            System.out.println(result);
            return (result);
        }
    
    public abstract int randInt();
    
    public static void main(String[] args) {       
    }  
}
