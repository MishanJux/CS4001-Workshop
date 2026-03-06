public class LiteralPractice {
    public static void main(String[] args) {

        // long - needs L suffix because the number is too big for an int
        long nepaliPopulation = 30000000L;

        // float - needs f suffix, otherwise Java treats it as a double by default
        float itemPrice = 450.50f;

        // char using unicode escape sequence - \u00A9 is the copyright symbol
        char cSymbol = '\u00A9';

        System.out.println("long value  : " + nepaliPopulation);
        System.out.println("float value : " + itemPrice);
        System.out.println("char value  : " + cSymbol);
    }
}
