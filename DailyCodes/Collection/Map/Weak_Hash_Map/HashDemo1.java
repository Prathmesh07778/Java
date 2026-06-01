package DailyCodes.Collection.Map.Weak_Hash_Map;

import java.util.*;

class Demo{

    public void finalize(){

        System.out.println("object gheun chalalo");
    }
}

public class HashDemo1 {
    
    public static void main(String[] args){

        WeakHashMap whm = new WeakHashMap();
        Demo obj1 = new Demo();

        whm.put(obj1,"ABC");
        System.out.println(whm);

        obj1 = null;
        
        System.gc();

        System.out.println(whm);

    }
}
