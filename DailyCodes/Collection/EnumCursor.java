package DailyCodes.Collection;


import java.util.*;

class EnumCursor{

    public static void main(String[] args){

        Vector <String> v = new Vector <String> ();

        v.add("Kanha");
        v.add("Ashish");
        v.add("Rahul");
        v.add("Badhe");

        System.out.println(v);

        Enumeration itr = v.elements();

        while (itr.hasMoreElements()) {
            
            System.out.println(itr.nextElement());
        }
    }
}