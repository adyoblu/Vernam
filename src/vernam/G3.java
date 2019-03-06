package vernam;

import java.util.*;


public class G3 extends Vernam{
    int key;
    
    public int randInt() 
     {
         Random r = new Random();
         int x = r.nextInt(50000);
         int y = r.nextInt(50000);
         key = x ^ y;
         return (key);
     }
}
