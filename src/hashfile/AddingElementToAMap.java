package hashfile;
import java.util.HashMap;
import java.util.Map;
public class AddingElementToAMap {
    public static void main(String[] args){
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        //am about to insert a new element
        map1.put(1,"Welcome");
        map1.put(2,"to");
        map1.put(3,"simplilearn");
        map2.put(new Integer(1), "Welcome");
        map2.put(new Integer(2), "to");
        map2.put(new Integer(3), "simplilearn");
        System.out.println(map1);
        System.out.println(map2);

    }

}
