package org.projii.commons;

public class TimeLogger {
    private static final long timeOfStart = System.currentTimeMillis();

    public static void d(String... message) {
        System.out.print(System.currentTimeMillis() - timeOfStart);
        System.out.print(" > ");
        for (String s : message) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
    }
}
