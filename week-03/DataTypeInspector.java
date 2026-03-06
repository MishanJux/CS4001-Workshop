public class DataTypeInspector {
    public static void main(String[] args) {

        // all 8 primitive types with appropriate literal values
        byte   age         = 21;
        short  students    = 1500;
        int    population  = 850000;
        long   worldPop    = 8100000000L;
        float  temperature = 36.6f;
        double pi          = 3.14159265358979;
        char   initial     = 'S';
        boolean isEnrolled = true;

        System.out.println("byte    - age:         " + age);
        System.out.println("short   - students:    " + students);
        System.out.println("int     - population:  " + population);
        System.out.println("long    - world pop:   " + worldPop);
        System.out.println("float   - temperature: " + temperature);
        System.out.println("double  - pi value:    " + pi);
        System.out.println("char    - initial:     " + initial);
        System.out.println("boolean - enrolled:    " + isEnrolled);
    }
}
