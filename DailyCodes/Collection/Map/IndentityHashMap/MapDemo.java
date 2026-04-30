package DailyCodes.Collection.Map.IndentityHashMap;

import java.util.*;

public class MapDemo {
    
    public static void main(String[] args){

        IdentityHashMap hm = new IdentityHashMap();

        hm.put(12,"Kanha");
        hm.put(new Integer(12),"Kanha");

        hm.put(new Integer(20),"Rahul");

        hm.put(128,"Badhe");
        hm.put(12,"Jaddu");



        
        System.out.println(hm);
    }
}
