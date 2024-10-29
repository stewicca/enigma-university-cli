package com.enigma.university;

import java.util.Scanner;

public class InputUtils {
    static Scanner scanner = new Scanner(System.in);

    public static String inputString(String info) {
        while (true) {
            System.out.printf("%s : ", info);
            String input = scanner.nextLine();
            if (input.isEmpty()) continue;
            return input;
        }
    }

    public static String inputName(String info) {
        String input = inputString(info);
        int inputLength = input.length();
        if (inputLength < 3 || inputLength > 20) input = inputName(info);
        return input;
    }

    public static String inputMajor(String info) {
        String input = inputString(info);
        int inputLength = input.length();
        if (inputLength > 10) input = inputMajor(info);
        return input;
    }

    public static int inputInt(String info) {
        while (true) {
            System.out.printf("%s : ", info);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException error) {
                // Ignore
            }

        }
    }

    public static int inputAge(String info) {
        int input = inputInt(info);
        if (input < 17) input = inputAge(info);
        return input;
    }
}