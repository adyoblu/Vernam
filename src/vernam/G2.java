package vernam;

import java.util.*;


public class G2 extends Vernam{
    int key;
    
    public int randInt() 
     {
         Random r = new Random();
         int x = r.nextInt(5000);
         int y = r.nextInt(5000);
         key = x * y;
         return (key);
     }
}