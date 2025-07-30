// 04_NarrowingTypeConversion.java
public class NarrowingTypeConversion {
    public static void main(String[] args) {
        double doubleVal = 123.456;
        float floatVal = (float) doubleVal; // double to float
        long longVal = (long) floatVal;     // float to long
        int intVal = (int) longVal;         // long to int

        System.out.println("--- Narrowing Type Conversion ---");
        System.out.println("Double value: " + doubleVal);
        System.out.println("Converted to float: " + floatVal);
        System.out.println("Converted to long: " + longVal);
        System.out.println("Converted to int: " + intVal);
    }
}

