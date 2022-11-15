import java.util.Arrays;

public class EnhancedFor {
    public static void main(String[] args) {
        int vals[] = new int[10];
        for(int i = 0; i < vals.length; i++){
            vals[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(vals));
        for (int v: vals){
            System.out.println(v);
        }
    }
}
