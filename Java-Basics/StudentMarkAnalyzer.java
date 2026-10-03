import java.util.Scanner;

public class StudentMarksAnalyzer 
{

    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("===== STUDENT MARKS ANALYZER =====");

        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int mark : marks) {

            total += mark;

            if (mark > highest) 
            {
                highest = mark;
            }

            if (mark < lowest)
            {
                lowest = mark;
            }
        }

        double average = total / (double) marks.length;

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks   : " + total);
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}