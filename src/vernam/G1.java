package vernam;

import java.util.*;


public class G1 extends Vernam{   
    int key;
    
    public int randInt() 
     {
         Random r = new Random();
         int x = r.nextInt(500);
         int y = r.nextInt(500);
         key = x + y;
         return (key);
     }
}
