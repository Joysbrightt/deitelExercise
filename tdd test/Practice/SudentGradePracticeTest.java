package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SudentGradePracticeTest {
//    StudentGradePractice report;
//    @BeforeEach
//   public void  startWith(){
//
//    }

    @Test
    public void testForSumPerStudent(){

        int[][] grades = {{10,10, 10}, {40,40,20}};
        StudentGradePractice report = new StudentGradePractice(grades);

assertEquals(100, report.getSumGrades(1));
assertEquals(30, report.getSumGrades(0));

    }

    @Test
    void getStudentAverageTest(){
        int[][] grades = {{10,10, 10, 10, 60}, {4,5,6,3}};
        StudentGradePractice report = new StudentGradePractice(grades);

    report.GetAverageForStudent(0);
    assertEquals(20.0, report.GetAverageForStudent(0));

    report.GetAverageForStudent(1);
        assertEquals(4.5, report.GetAverageForStudent(1));

    }

    @Test
    int getStudentPositionTest(int i){

        int[][] grades = {{10,10, 10, 10, 60}, {30,30, 10, 10, 20}};
        StudentGradePractice report = new StudentGradePractice(grades);

        report.getStudentPosition(0);
        assertEquals(1, getStudentPositionTest(0));


        return i;
    }



}