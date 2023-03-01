import java.util.ArrayList;

public class ALRunner {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "Z");
        list.remove(2);
        String s1 =list.get(0);
        String s2 = list.get(2);
        list.set(0, s2);
        list.set(2, s1);
        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}
