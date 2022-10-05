package apcs.student;

public class StudentRunner {
    public static void main(String[] args) {
       System.out.println("Building Student 1");
       System.out.println();
       Student s1 = new Student (123456);
       s1.setName("Sergio Aguilar");
       System.out.println (s1);
       System.out.println ("Average score for Period 1: " + s1.getAverages(1));
       System.out.println ("Average score for Period 2: " + s1.getAverages(2));
       System.out.println ("Average score for Period 3: " + s1.getAverages(3));
       System.out.println ("Average score for all classes: " + s1.getAllAverages());
       System.out.println ("Maximum score for Period 1: " + s1.getMaximum(1));
       System.out.println ("Maximum score for Period 2: " + s1.getMaximum(2));
       System.out.println ("Maximum score for Period 3: " + s1.getMaximum(3));
       System.out.println();
       s1.setScore(1, 1, 95.0);
       s1.setScore(1, 2, 87.5);
       s1.setScore(1, 3, 84.5);
       s1.setScore(2, 1, 78.0);
       s1.setScore(2, 2, 99.0);
       s1.setScore(2, 3, 61.0);
       s1.setScore(3, 1, 97.0);
       s1.setScore(3, 2, 82.1);
       s1.setScore(3, 3, 100);
       s1.setClasses(1, "Math");
       s1.setClasses(2, "Science");
       s1.setClasses(3, "English");
       System.out.println("Final data for " + s1.getName() + ":");
       System.out.println(s1);
       System.out.println("\nPeriod 1: " + s1.getClasses(1));
       System.out.println ("Test 1: " + s1.getScore(1, 1));
       System.out.println ("Test 2: " + s1.getScore(1, 2));
       System.out.println ("Test 3: " + s1.getScore(1, 3));
       System.out.println("Average score for Period 1: " + s1.getAverages(1));
       System.out.println("Maximum score for Period 1: " + s1.getMaximum(1));
       System.out.println("\nPeriod 2: " + s1.getClasses(2));
       System.out.println ("Test 1: " + s1.getScore(2, 1));
       System.out.println ("Test 2: " + s1.getScore(2, 2));
       System.out.println ("Test 3: " + s1.getScore(2, 3));
       System.out.println("Average score for Period 2: " + s1.getAverages(2));
       System.out.println("Maximum score for Period 2: " + s1.getMaximum(2));
       System.out.println("\nPeriod 3: " + s1.getClasses(3));
       System.out.println ("Test 1: " + s1.getScore(3, 1));
       System.out.println ("Test 2: " + s1.getScore(3, 2));
       System.out.println ("Test 3: " + s1.getScore(3, 3));
       System.out.println("Average score for Period 3: " + s1.getAverages(3));
       System.out.println("Maximum score for Period 3: " + s1.getMaximum(3));
       System.out.println("\nAverage score for all classes: " + s1.getAllAverages());

       System.out.println ();

       System.out.println("Building Student 2");
       System.out.println();
       Student s2 = new Student (987654);
       s1.setName("Sarah Bates");
       System.out.println (s2);
       System.out.println ("Average score for Period 1: " + s1.getAverages(1));
       System.out.println ("Average score for Period 2: " + s1.getAverages(2));
       System.out.println ("Average score for Period 3: " + s1.getAverages(3));
       System.out.println ("Average score for all classes: " + s1.getAllAverages());
       System.out.println ("Maximum score for Period 1: " + s1.getMaximum(1));
       System.out.println ("Maximum score for Period 2: " + s1.getMaximum(2));
       System.out.println ("Maximum score for Period 3: " + s1.getMaximum(3));
       System.out.println();
       s1.setScore(1, 1, 10.0);
       s1.setScore(1, 2, 37.6);
       s1.setScore(1, 3, 50.4);
       s1.setScore(2, 1, 84.7);
       s1.setScore(2, 2, 96.2);
       s1.setScore(2, 3, 100);
       s1.setScore(3, 1, 12.5);
       s1.setScore(3, 2, 96.6);
       s1.setScore(3, 3, 94.5);
       s1.setClasses(1, "History");
       s1.setClasses(2, "Art");
       s1.setClasses(3, "Spanish");
       System.out.println("Final data for " + s1.getName() + ":");
       System.out.println(s1);
       System.out.println("\nPeriod 1: " + s1.getClasses(1));
       System.out.println ("Test 1: " + s1.getScore(1, 1));
       System.out.println ("Test 2: " + s1.getScore(1, 2));
       System.out.println ("Test 3: " + s1.getScore(1, 3));
       System.out.println("Average score for Period 1: " + s1.getAverages(1));
       System.out.println("Maximum score for Period 1: " + s1.getMaximum(1));
       System.out.println("\nPeriod 2: " + s1.getClasses(2));
       System.out.println ("Test 1: " + s1.getScore(2, 1));
       System.out.println ("Test 2: " + s1.getScore(2, 2));
       System.out.println ("Test 3: " + s1.getScore(2, 3));
       System.out.println("Average score for Period 2: " + s1.getAverages(2));
       System.out.println("Maximum score for Period 2: " + s1.getMaximum(2));
       System.out.println("\nPeriod 3: " + s1.getClasses(3));
       System.out.println ("Test 1: " + s1.getScore(3, 1));
       System.out.println ("Test 2: " + s1.getScore(3, 2));
       System.out.println ("Test 3: " + s1.getScore(3, 3));
       System.out.println("Average score for Period 3: " + s1.getAverages(3));
       System.out.println("Maximum score for Period 3: " + s1.getMaximum(3));
       System.out.println("\nAverage score for all classes: " + s1.getAllAverages());

       System.out.println ();
       System.out.println("Building Student 3 (with same id as Student 1)");
//       Student s3 = new Student ("Herman Johnson", 123456, 98, 96, 82);
//       System.out.println (s3);
//       System.out.println ("Average score: " + s3.getAverage());
//       System.out.println ("Maximum score: " + s3.getMaximum());
//
//       System.out.println ();
       System.out.println("Building Student 3 (With same id as Student 1)");
       System.out.println();
       Student s3 = new Student (123456);
       s1.setName("Herman Johnson");
       System.out.println (s3);
       System.out.println ("Average score for Period 1: " + s1.getAverages(1));
       System.out.println ("Average score for Period 2: " + s1.getAverages(2));
       System.out.println ("Average score for Period 3: " + s1.getAverages(3));
       System.out.println ("Average score for all classes: " + s1.getAllAverages());
       System.out.println ("Maximum score for Period 1: " + s1.getMaximum(1));
       System.out.println ("Maximum score for Period 2: " + s1.getMaximum(2));
       System.out.println ("Maximum score for Period 3: " + s1.getMaximum(3));
       System.out.println();
       s1.setScore(1, 1, 7.6);
       s1.setScore(1, 2, 76.23);
       s1.setScore(1, 3, 19.1);
       s1.setScore(2, 1, 92.65);
       s1.setScore(2, 2, 100);
       s1.setScore(2, 3, 1.01);
       s1.setScore(3, 1, 34.7);
       s1.setScore(3, 2, 87.4);
       s1.setScore(3, 3, 98.7);
       s1.setClasses(1, "Theater");
       s1.setClasses(2, "Innovations");
       s1.setClasses(3, "Choir");
       System.out.println("Final data for " + s1.getName() + ":");
       System.out.println(s1);
       System.out.println("\nPeriod 1: " + s1.getClasses(1));
       System.out.println ("Test 1: " + s1.getScore(1, 1));
       System.out.println ("Test 2: " + s1.getScore(1, 2));
       System.out.println ("Test 3: " + s1.getScore(1, 3));
       System.out.println("Average score for Period 1: " + s1.getAverages(1));
       System.out.println("Maximum score for Period 1: " + s1.getMaximum(1));
       System.out.println("\nPeriod 2: " + s1.getClasses(2));
       System.out.println ("Test 1: " + s1.getScore(2, 1));
       System.out.println ("Test 2: " + s1.getScore(2, 2));
       System.out.println ("Test 3: " + s1.getScore(2, 3));
       System.out.println("Average score for Period 2: " + s1.getAverages(2));
       System.out.println("Maximum score for Period 2: " + s1.getMaximum(2));
       System.out.println("\nPeriod 3: " + s1.getClasses(3));
       System.out.println ("Test 1: " + s1.getScore(3, 1));
       System.out.println ("Test 2: " + s1.getScore(3, 2));
       System.out.println ("Test 3: " + s1.getScore(3, 3));
       System.out.println("Average score for Period 3: " + s1.getAverages(3));
       System.out.println("Maximum score for Period 3: " + s1.getMaximum(3));
       System.out.println("\nAverage score for all classes: " + s1.getAllAverages());

//
//
//       if (s1.equals(s2)) {
//           System.out.println(s1.getName() + " is actually the same student as " + s2.getName());
//       }
//       else{
//           System.out.println(s1.getName() + " is a different student as " + s2.getName());
//       }
//
//       if (s1.equals(s3)) {
//           System.out.println(s1.getName() + " is actually the same student as " + s3.getName());
//       }
//       else{
//           System.out.println(s1.getName() + " is a different student as " + s3.getName());
//       }
    }
}


