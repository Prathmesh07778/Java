package DailyCodes.Collection.List.ArrayList;

import java.util.*;

// To understand Comparator Comcept

class Player {

    String pName;
    int jerNo;

    Player(String pName, int jerNo){

        this.pName = pName;
        this.jerNo = jerNo;

    }

    void disp(){

        System.out.println("Player Name :" + pName + "Jersey No : " + jerNo);

    }
}

class SortByName implements Comparator <Player>{ 
    
    public int compare(Player obj1, Player obj2){

        return obj1.pName.compareTo(obj2.pName);

    }
}
    

class SortByJerseyNo implements Comparator<Player>{
    
    public int compare(Player obj1, Player obj2){

        return obj1.jerNo  - obj2.jerNo;
    }
}



public class ArrayListDemo{
    
    public static void main(String[] args){

        ArrayList<Player> ts = new ArrayList<>();


        ts.add(new Player("Virat", 18));
        ts.add(new Player("Rohit", 45));
        ts.add(new Player("MSD", 7));
        ts.add(new Player("Shuhaman", 77));

        Collections.sort(ts,new SortByName());

        Iterator<Player>itr = ts.iterator();

        while(itr.hasNext()){

            Player obj = (Player)itr.next();
            obj.disp();

            
        }

        Collections.sort(ts,new SortByJerseyNo());

        Iterator<Player>itr1 = ts.iterator();

        while(itr1.hasNext()){

            Player obj = itr1.next();
            obj.disp();

            
        }
    }
}
