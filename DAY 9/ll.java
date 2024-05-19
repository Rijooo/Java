

import java.util.Iterator;
import java.util.LinkedList;



public class ll {
    public static void main(String[] args)
    {
        LinkedList <String> win = new LinkedList<String>();

        win.add("ronnie");
        win.add("ronni");
        win.add("ronne");
        win.add("ronie");
        Iterator itr = win.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
