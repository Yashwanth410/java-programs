// 03_WideningTypeConversion.java
public class WideningTypeConversion {
    public static void main(String[] args) {
        int intVal = 100;
        long longVal = intVal; // int to long
        float floatVal = longVal; // long to float
        double doubleVal = floatVal; // float to double

        System.out.println("--- Widening Type Conversion ---");
        System.out.println("Integer value: " + intVal);
        System.out.println("Converted to long: " + longVal);
        System.out.println("Converted to float: " + floatVal);
        System.out.println("Converted to double: " + doubleVal);
    }
}

