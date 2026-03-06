public class DefaultValues {

    // member variables declared without being given any value
    // Java automatically gives these fields default values
    byte    myByte;
    short   myShort;
    int     myInt;
    long    myLong;
    float   myFloat;
    double  myDouble;
    char    myChar;
    boolean myBoolean;

    public static void main(String[] args) {

        // creating an object so we can access the fields
        DefaultValues d = new DefaultValues();

        System.out.println("Default values when fields are not initialised:");
        System.out.println("byte:    " + d.myByte);
        System.out.println("short:   " + d.myShort);
        System.out.println("int:     " + d.myInt);
        System.out.println("long:    " + d.myLong);
        System.out.println("float:   " + d.myFloat);
        System.out.println("double:  " + d.myDouble);
        System.out.println("char:    " + d.myChar);
        System.out.println("boolean: " + d.myBoolean);

        // WHY THIS DOES NOT WORK FOR LOCAL VARIABLES:
        // Local variables live inside a method and Java does NOT initialise them
        // automatically. The compiler will refuse to compile the code and give an error
        // saying the variable has not been initialised. This is different from fields
        // which belong to an object and always get a default value (0, false, \u0000).
    }
}
