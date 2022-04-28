import java .util.ArrayList;
import java .util.Collections;
public class Part2{
    public static void main(String[] args) 
    { 
        ArrayList< Integer> list= new ArrayList<>();
        //add element
        list.add(0);
        list.add(9);
        list.add(10);
        list.add(5);
        System.out.println(list);
        // al aat index
       int index1= list.get(0);
        int index2=list.get(3);
        System.out.println(index1 +","+index2);
        list.add(0,9);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        for(int i=0;i<list.size(); i++ )
        {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    } 
}

