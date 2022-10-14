package apcs.student;

public class Student {

    private String name;
    private int id;
    private double class1Test1;
    private double class1Test2;
    private double class1Test3;
    private double class2Test1;
    private double class2Test2;
    private double class2Test3;
    private double class3Test1;
    private double class3Test2;
    private double class3Test3;

    private String class1;
    private String class2;
    private String class3;

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

    public double getScore(int period, int test) {
        if (period == 1) {
            if (test == 1) {
                return class1Test1;
            } else if (test == 2) {
                return class1Test2;
            } else if (test == 3) {
                return class1Test3;
            } else {
                return -1.0;
            }
        } else if (period == 2) {
            if (test == 1) {
                return class2Test1;
            } else if (test == 2) {
                return class2Test2;
            } else if (test == 3) {
                return class2Test3;
            } else {
                return -1.0;
            }
        } else if (period == 3) {
            if (test == 1) {
                return class3Test1;
            } else if (test == 2) {
                return class3Test2;
            } else if (test == 3) {
                return class3Test3;
            } else {
                return -1.0;
            }
        }else{
            return -1.0;
        }
    }


    public void setScore(int period, int test, double score) {
        if (period == 1) {
            if (test == 1) {
                class1Test1 = score;
            } else if (test == 2) {
                class1Test2 = score;
            } else if (test == 3) {
                class1Test3 = score;
            }
        }else if (period == 2) {
            if (test == 1) {
                class2Test1 = score;
            } else if (test == 2) {
                class2Test2 = score;
            } else if (test == 3) {
                class2Test3 = score;
            }
        }else if (period == 3) {
            if (test == 1) {
                class3Test1 = score;
            } else if (test == 2) {
                class3Test2 = score;
            } else if (test == 3) {
                class3Test3 = score;
            }
        }
    }

    public int getId() {
        return id;
    }

    public double getAverages(int period) {
        if (period == 1){
            return (class1Test1 +  class1Test2 + class1Test3)/3;
        }else if (period == 2){
            return (class2Test1 +  class2Test2 + class2Test3)/3;
        }else if (period == 3){
            return (class3Test1 +  class3Test2 + class3Test3)/3;
        }else{
            return -1.0;
        }
    }

    public double getAllAverages() {
        return ((class1Test1 + class1Test2 + class1Test3 + class2Test1 + class2Test2 + class2Test3 + class3Test1 + class3Test2 + class3Test3) / 9);
    }

    public double getMaximum(int period) {
        if (period == 1) {
            if (class1Test1 > class1Test2) {
                if (class1Test1 > class1Test3) {
                    return class1Test1;
                } else if (class1Test3 > class1Test2) {
                    return class1Test3;
                }else {
                    return class1Test3;
                }
            }else if (class1Test2 > class1Test3){
                return class1Test2;
            }else if (class1Test3 > class1Test2){
                return class1Test3;
            }else{
                return -1.0;
            }
         }else if (period == 2) {
             if (class2Test1 > class2Test2) {
                 if (class2Test1 > class2Test3) {
                     return class2Test1;
                 } else if (class2Test3 > class2Test2) {
                     return class2Test3;
                 }else {
                     return class2Test3;
                 }
             }else if (class2Test2 > class2Test3){
                 return class2Test2;
             }else if (class2Test3 > class2Test2){
                 return class2Test3;
             }else{
                 return -1.0;
             }
         }else if (period == 3) {
            if (class3Test1 > class3Test2) {
                if (class3Test1 > class3Test3) {
                    return class3Test1;
                } else if (class3Test3 > class3Test2) {
                    return class3Test3;
                }else {
                    return class3Test3;
                }
            }else if (class3Test2 > class3Test3){
                return class3Test2;
            }else if (class3Test3 > class3Test2){
                return class3Test3;
            }else{
                return -1.0;
            }
         }else
             return -1.0;
    }
    public Student(String name, int id, double class1test1, double class1test2, double class1Test3, double class2Test1, double class2Test2, double class2Test3, double class3Test1, double class3Test2, double class3Test3, String class1, String class2, String class3){
        this.name = name;
        this.id = id;
        this.class1 = class1;
        this.class2 = class2;
        this.class3 = class3;
        this.class1Test1 = class1Test1;
        this.class1Test2 = class1Test2;
        this.class1Test3 = class1Test3;
        this.class2Test1 = class2Test1;
        this.class2Test2 = class2Test2;
        this.class2Test3 = class2Test3;
        this.class3Test1 = class3Test1;
        this.class3Test2 = class3Test2;
        this.class3Test3 = class3Test3;

    }


    public boolean equals (Student other){
        if (this.id == other.getId()){
            return true;
        } else {
            return false;
        }
    }
    public String getClasses(int period) {
        if (period == 1){
            return class1;
        } else if (period == 2){
            return  class2;
        } else if (period == 3){
            return class3;
        } else
            return "n/a";
    }
    public void setClasses(int period, String subject) {
        if (period == 1) {
            this.class1 = subject;
        }else if(period == 2){
            this.class2 = subject;
        }else if (period == 3) {
            this.class3 = subject;
        }
    }

    public void isStudentDead(Student other){
        if (this.id == other.getId()) {
            int randVal = (int) (Math.random() * 2 + 1);
            if (randVal == 1) {
                System.out.println(this.getName() + " is committing identity theft on " + other.getName());
                System.out.println( this.getName() + " died because he committed identity theft");
            } else {
                System.out.println(other.getName() + " is committing identity theft on " + this.getName());
                System.out.println(other.getName() + " died because he committed identity theft");
            }
        }
    }

    public boolean compareStudents(Student other) {
        if (this.getAllAverages() >= other.getAllAverages()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String info = "Student Name: " + name + "  ID: " + id + "  Period 1: " + class1 + "  Test Scores: "+ class1Test1 + ", " + class1Test2 + ", " + class1Test3 + "  Period 2:  " + class2 + " Test Scores: " + class2Test1 + ", " + class2Test2 + ", " + class2Test3 + "  Period 3: " + class3 + " Test Scores: " + class3Test1 + ", " +class3Test2+ ", " + class3Test3;
        return info;
    }
}
