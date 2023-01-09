import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        for(int i = Integer.MAX_VALUE;i > Integer.MAX_VALUE - 20; i--){

            list.add(Math.random());
//        Math.random()

        }
        System.out.println(list.size());
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) * -1.0);

        }

        System.out.println(list);

        Double min = Double.MIN_VALUE;
        for(Double arggs:list){
            if(min > arggs){
                min = arggs;
            }
        }

        System.out.println(min);

        for(int i = 1; i < 40 ; i += 2){
            list.add(i - 1, 0.0);
        }
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > -0.5){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }

}
