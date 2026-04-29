package DailyCodes.Collection.Set.TreeSet2;



import java.util.*;

class Player {

    String pName;
    int jerNo;

    Player(String pName, int jerNo) {
        this.pName = pName;
        this.jerNo = jerNo;
    }

    public String toString() {
        return pName + " - " + jerNo;
    }
}

class SortByJerseyNo implements Comparator<Player> {

    public int compare(Player obj1, Player obj2) {
        return obj1.jerNo - obj2.jerNo;
    }
}

public class Main {

    public static void main(String[] args) {

        TreeSet<Player> ts =
            new TreeSet<>(new SortByJerseyNo());

        ts.add(new Player("Virat", 18));
        ts.add(new Player("Rohit", 45));
        ts.add(new Player("MSD", 7));

        System.out.println(ts);
    }
}
