package Practice;

public class StudentGradePractice {
    private int[][] grades;

    public StudentGradePractice(int[][] grades) {
        this.grades = grades;


    }

    public int getSumGrades(int indexNumber) {
        int sum = 0;
        for (int column = 0; column < grades[indexNumber].length; column++) {
            sum += grades[indexNumber][column];
            int total = sum;

        }
        return sum;
    }

    public double GetAverageForStudent(int indexnumber) {

        return (double) getSumGrades(indexnumber) / grades[indexnumber].length;
    }

    public int getStudentPosition(int indexNumber) {
        int[] arrayOfStudentSum = new int[grades.length];
//        // get the sum
        for (int row = 0; row < grades.length; row++) {
//            int sum = 0;
//            sum += getSumGrades(row);
            // store the sum in an array
            arrayOfStudentSum[row] = getSumGrades(row);
//            for (int column = 0; column < grades[row].length; column++) {
//
//            }
////
//
//        }
            // sort in descending order
            for (int index = 0; index < arrayOfStudentSum.length; index++) {

                for (int nextcount = 0; nextcount < arrayOfStudentSum.length ; nextcount++) {

                    if(arrayOfStudentSum[row] < arrayOfStudentSum[nextcount]){
                            int temp;
                            temp = arrayOfStudentSum[index];
                    }



                }

            }
            // get the index of the student using the sum
            // add 1 to the index


        }
        return indexNumber;
    }
}