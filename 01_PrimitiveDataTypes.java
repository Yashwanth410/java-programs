public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Primitive data types with initialization
        byte byteVal = 10;
        short shortVal = 100;
        int intVal = 1000;
        long longVal = 10000L;
        float floatVal = 3.14f;
        double doubleVal = 3.1415926535;
        char charVal = 'A';
        boolean boolVal = true;

        System.out.println("--- Primitive Data Types and Their Sizes ---");
        System.out.println("byte value: " + byteVal + " | Size: " + Byte.BYTES + " bytes");
        System.out.println("short value: " + shortVal + " | Size: " + Short.BYTES + " bytes");
        System.out.println("int value: " + intVal + " | Size: " + Integer.BYTES + " bytes");
        System.out.println("long value: " + longVal + " | Size: " + Long.BYTES + " bytes");
        System.out.println("float value: " + floatVal + " | Size: " + Float.BYTES + " bytes");
        System.out.println("double value: " + doubleVal + " | Size: " + Double.BYTES + " bytes");
        System.out.println("char value: " + charVal + " | Size: " + Character.BYTES + " bytes");
        System.out.println("boolean value: " + boolVal + " | Size: " + "1 bit (not precisely defined in Java)");
    }
}

