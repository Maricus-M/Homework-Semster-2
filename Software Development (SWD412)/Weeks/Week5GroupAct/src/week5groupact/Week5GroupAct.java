// Adriana's questions


package week5groupact;

import java.util.ArrayList;

public class Week5GroupAct {

    public static void main(String[] args) {
        // 1. For Loop vs. While Loop
        System.out.println("For Loop Example:");
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop iteration: " + i);
        }

        System.out.println("\nWhile Loop Example:");
        int j = 0;
        while (j < 5) {
            System.out.println("While Loop iteration: " + j);
            j++;
        }

        // 2. Creating and Using an Array
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("\nArray Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 3. Access Modifiers (public, private, protected)
        AccessModifiers obj = new AccessModifiers();
        System.out.println("\nAccess Modifiers Example:");
        System.out.println("Public Variable: " + obj.publicVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        obj.showVars(); // Accessing private variable within its own class

        // 4. Comparing Objects with == and .equals()
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("\nComparison Example:");
        if (str1 == str2) {
            System.out.println("str1 and str2 are the same reference");
        } else {
            System.out.println("str1 and str2 are different references");
        }

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 have the same content");
        } else {
            System.out.println("str1 and str2 have different content");
        }

        // 5.  Using ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("\nArrayList Example:");
        System.out.println("First fruit: " + fruits.get(0));
        fruits.remove("Banana");

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        System.out.println("Total number of fruits: " + fruits.size());
    }

    private static class AccessModifiers {

        private String publicVar;
        private String protectedVar;

        public AccessModifiers() {
        }

        private void showVars() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

