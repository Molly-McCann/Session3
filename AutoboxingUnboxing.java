
// Molly McCann
// 01.26.2024

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Autoboxing: Converting int to Integer
        Integer numObj = 42;

        // Auto-unboxing: Converting Integer to int
        int num = numObj;

        System.out.println("Original value (int): " + num);
        System.out.println("Unboxed value (Integer): " + numObj);
    }
}
