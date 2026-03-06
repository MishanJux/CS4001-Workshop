public class MathOperations {
    public static void main(String[] args) {

        int num1 = 18;
        int num2 = 5;

        // arithmetic operators
        System.out.println("-- Arithmetic --");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        // unary operators - post and pre increment/decrement
        int count = 7;
        System.out.println("\n-- Unary --");
        System.out.println("count starts at: " + count);
        System.out.println("count++ gives: " + count++);
        System.out.println("now count is: " + count);
        System.out.println("++count gives: " + (++count));
        System.out.println("count-- gives: " + count--);
        System.out.println("now count is: " + count);

        // assignment operators
        int val = 50;
        System.out.println("\n-- Assignment --");
        System.out.println("val = " + val);
        val += 10; System.out.println("val += 10  =>  " + val);
        val -= 5;  System.out.println("val -= 5   =>  " + val);
        val *= 2;  System.out.println("val *= 2   =>  " + val);
        val /= 3;  System.out.println("val /= 3   =>  " + val);
        val %= 7;  System.out.println("val %= 7   =>  " + val);

        // relational operators
        int a = 9, b = 14;
        System.out.println("\n-- Relational --");
        System.out.println("a=9  b=14");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // logical operators
        boolean raining = true;
        boolean cold = false;
        System.out.println("\n-- Logical --");
        System.out.println("raining=" + raining + "  cold=" + cold);
        System.out.println("raining && cold : " + (raining && cold));
        System.out.println("raining || cold : " + (raining || cold));
        System.out.println("!raining        : " + (!raining));

        // ternary operator
        int score = 72;
        System.out.println("\n-- Ternary --");
        String grade = (score >= 40) ? "Pass" : "Fail";
        System.out.println("score=" + score + "  result: " + grade);
    }
}
