import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade: ");
        int grade = sc.nextInt();

        // ternary operator to check pass or fail
        String status = (grade >= 40) ? "Pass" : "Fail";

        // escape sequences used for formatting: \n newline, \t tab
        System.out.println("\n--- Result ---");
        System.out.println("Grade:\t" + grade);
        System.out.println("Status:\t" + status);
        System.out.println("--------------\n");

        sc.close();
    }
}
