
package apcs.newStudent;

/**
 * This class models a single Student and their scores on tests.
 *
 * @author Robert Hettmansperger
 */
public class Student {
    private String name;
    private int id;
    private double tests[];
    /**
     * Creates a new instance of Student with the specified id number.  Test scores are initialized to 0.
     *
     * @param id the student id
     */
    public Student(int id) {
        this.name = "";
        this.id = id;
        this.tests = new double[3];
        this.tests[0] = 0.0;
        this.tests[1] = 0.0;
        this.tests[2] = 0.0;
    }

    /**
     * Creates a new instance of Student in which all fields are settable.
     *
     * @param name The student's name
     * @param id The student's id number
     * @param test1 The student's test 1 score
     * @param test2 The student's test 2 score
     * @param test3 The student's test 3 score
     */
    public Student(String name, int id, double test1, double test2, double test3) {
        this.name = name;
        this.id = id;
        this.tests = new double[3];
        this.tests[0] = test1;
        this.tests[1] = test2;
        this.tests[2] = test3;
    }

    public Student(int id, int numTests){
        this.tests = new double[numTests];
        this.name = "";
        this.id = id;
    }

    public Student(String name, int id, int numTests){
        this.name = name;
        this.id = id;
        this.tests = new double[numTests];
    }
    /**
     * Retrieves a student's name
     * @return The student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a student's name
     * @param name The student's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieve's a student's id
     * @return the student id number
     */
    public int getId() {
        return this.id;
    }

    /**
     * Retrieves one test score for a student
     * @param test which test number to retrieve (1 through 3)
     * @return The specified test score
     */
    public double getScore(int test) {
       return this.tests[test-1];
    }

    /**
     * Updates a test score for a Student.
     * @param test  The test number to update (1 through 3)
     * @param score The new test score
     */
    public void setScore(int test, double score) {
        this.tests[test-1] = score;
    }

    /**
     * Calculates and returns the average of any tests taken
     *
     * @return The average score of all three tests
     */
    public double getAverage() {
        double sum = 0;
        for(double test:tests){
            sum += test;
        }
        return sum/this.tests.length;
    }

    /**
     * Gets and returns the highest test score
     * @return the maximum test score
     */
    public double getMaximum() {
        double max = Integer.MIN_VALUE;
        for(int i = 0; i < tests.length; i++){
            if(tests[i] > max){
                max = tests[i];
            }
        }
        return max;
    }

    public String toString() {
        String info = "Student Name: " + this.name + " id: " + this.id;
        for(int i = 0; i < this.tests.length; i++){
            info = info + " Test " + (i+1) + " " + this.tests[i];
        }
        return info;
    }

    public boolean equals(Student other) {
        if (this.id == other.getId())
            return true;
        else
            return false;
    }
}
