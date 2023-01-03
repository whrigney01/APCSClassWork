package apcs.newStudent;

public class StudentRunner {
    public static void main(String[] args) {
        System.out.println("Building Student 1");
        Student s1 = new Student(123456, 3);
        System.out.println(s1);
        s1.setName("Sergio Aguilar");
        System.out.println(s1);
        System.out.println("Average score: " + s1.getAverage());
        System.out.println("Maximum score: " + s1.getMaximum());
        s1.setScore(1, 95.0);
        System.out.println(s1);
        System.out.println("Average score: " + s1.getAverage());
        System.out.println("Maximum score: " + s1.getMaximum());
        s1.setScore(2, 99.0);
        System.out.println("Data for " + s1.getName() + ":");
        System.out.println("id: " + s1.getId());
        System.out.println("Test 1: " + s1.getScore(1));
        System.out.println("Test 2: " + s1.getScore(2));
        System.out.println("Test 3: " + s1.getScore(3));
        System.out.println("Average score: " + s1.getAverage());
        System.out.println("Maximum score: " + s1.getMaximum());
        s1.setScore(3, 97.0);
        System.out.println("Final data for " + s1.getName() + ":");
        System.out.println("id: " + s1.getId());
        System.out.println("Test 1: " + s1.getScore(1));
        System.out.println("Test 2: " + s1.getScore(2));
        System.out.println("Test 3: " + s1.getScore(3));
        System.out.println("Average score: " + s1.getAverage());
        System.out.println("Maximum score: " + s1.getMaximum());


        System.out.println();

        System.out.println("Building Student 2");
        Student s2 = new Student(987654, 3);
        System.out.println(s2);
        s2.setName("Sarah Bates");
        System.out.println(s2);
        s2.setScore(2, 95.0);
        System.out.println(s2);
        System.out.println("Average score: " + s2.getAverage());
        System.out.println("Maximum score: " + s2.getMaximum());
        s2.setScore(1, 99.0);
        System.out.println(s2);
        System.out.println("Average score: " + s2.getAverage());
        System.out.println("Maximum score: " + s2.getMaximum());
        s2.setScore(3, 87.0);
        System.out.println(s2);
        System.out.println("Average score: " + s2.getAverage());
        System.out.println("Maximum score: " + s2.getMaximum());

        System.out.println();

        System.out.println("Building Student 3 (with same id as Student 1)");
        Student s3 = new Student("Herman Johnson", 123456, 3);
        s3.setScore(1, 98);
        s3.setScore(2, 96);
        s3.setScore(3, 82);
        System.out.println(s3);
        System.out.println("Average score: " + s3.getAverage());
        System.out.println("Maximum score: " + s3.getMaximum());

        System.out.println();

        if (s1.equals(s2)) {
            System.out.println(s1.getName() + " is actually the same student as " + s2.getName());
        } else {
            System.out.println(s1.getName() + " is a different student as " + s2.getName());
        }

        if (s1.equals(s3)) {
            System.out.println(s1.getName() + " is actually the same student as " + s3.getName());
        } else {
            System.out.println(s1.getName() + " is a different student as " + s3.getName());
        }

        System.out.println();
        System.out.println("Building Student 4");
        Student s4 = new Student("Lan Cheung",45823,  5);
        s4.setScore (1, 90);
        s4.setScore (2, 80);
        s4.setScore (3, 100);
        s4.setScore (4, 70);
        s4.setScore (5, 85);
        System.out.println (s4);
        System.out.println ("Average: " + s4.getAverage ());
        System.out.println ("Max: " + s4.getMaximum ());
    }

}


