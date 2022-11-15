public class Array {
    public static void main(String[] args) {
        String school[] = {"Peak", "to", "Peak", "Charter", "School"};
//        for (int i =0; i < school.length; i++){
//            System.out.print(school[i]);
//        }
        System.out.println(concat(school));
    }

    public static String concat (String[] args){
        String value = "";
        for (int i =0; i < args.length; i++){
            value = value + args[i] + " ";
        }
        return value;
    }
}