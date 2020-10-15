public class Student extends Person{
        private int[] testScoresA;
    Student(String firstName, String lastName, int identification,int[] testScores) {
        super(firstName, lastName, identification);
        this.testScoresA=testScores;
    }
    public char calculate() {
        int x=testScoresA.length;
        double avg=0;
        char grade;
        for(int i=0;i<x;i++) {
        avg+=testScoresA[i];
        }
        avg/=x;
        return(avg> 89 ?'O': avg>79 ? 'E' : avg > 69 ? 'A' : avg > 54 ? 'P' :avg > 39 ? 'D' : 'T' );

    }

    /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here
    }

