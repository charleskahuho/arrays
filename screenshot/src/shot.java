import java.util.Scanner;

public class shot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        String[] students = new String[numStudents];
        int[][] marks = new int[numStudents][3];

        char[] result = new char[numStudents];
        char[] grade = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = input.next();
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the marks for subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
            }
            
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double average = totalMarks / 3.0;

            if (average >= 70) {
                grade[i] = 'A';
            } else if (average >= 50) {
                grade[i] = 'B';
            } else {
                grade[i] = 'C';
            }

            result[i] = (totalMarks >= 150) ? 'P' : 'F'; 
        }

        System.out.println("***************************************************");
        System.out.println("\t\t\tSTUDENT MARKLIST");
        System.out.println("***************************************************");
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tRESULT\tGRADE");

        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 101) + "\t" + students[i] + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + result[i] + "\t" + grade[i]);
        }
    }
}
