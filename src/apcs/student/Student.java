package apcs.student;

public class Student {

    private String name;
    private int id;
    private double testScore1;
    private double testScore2;
    private double testScore3;

    public Student(int id){
        this.name = "";
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore(int test) {
        if (test == 1) {
            return testScore1;
        } else if (test == 2) {
            return  testScore2;
        } else if (test == 3) {
            return testScore3;
        }else {
            return -1.0;
        }

    }


    public void setScore(int test, double score) {
        if (test == 1) {
            testScore1 = score;
        } else if (test == 2) {
            testScore1 = score;
        } else if (test == 3) {
            testScore1 = score;
        }
    }

    public int getId() {
        return id;
    }

    public double getAverage() {
        return (testScore1 + testScore2 + testScore3)/3;
    }

    public double getMaximum() {
        if (testScore1 > testScore2) {
            if (testScore1 > testScore3) {
                return testScore1;
            } else if (testScore3 > testScore2) {
                return testScore3;
            } else {
                return testScore2;
            }
        } else {
            return -1.0;
        }
    }
    public Student(String name, int id, double testScore1, double testScore2, double testScore3){
        this.name = name;
        this.id = id;
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }


    public boolean equal(Student other){
        if (this.getId() == other.getId()){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String info = "Student Name: " + name + "  ID: " + id + "  Test 1: " + testScore1 + "  Test 2: " + testScore2 + "  Test 3: " + testScore3;
        return info;
    }
}
