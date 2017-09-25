package oop1;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class StorageAddressComputer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to compute storage address by performing rotation and fold-shifts");

        String input = sc.next();

        String rotated_value = perform_rotation(input);

        StorageAddressComputer sac = new StorageAddressComputer();

        String fold_shift_value = sac.perform_fold_shift(rotated_value);

        System.out.println(fold_shift_value);

    }

    private static String perform_rotation (String value) {

        StringBuilder text = new StringBuilder(value);

        text.append(0);

        Integer counter = text.length() - 1;

        while (counter > 0) {

            text.setCharAt(counter, text.charAt(counter - 1));

            counter -= 1;
        }

        text.setCharAt(0, text.charAt(text.length() -1));

        text.deleteCharAt(text.length() - 1);

        return text.toString();
    }

    private String perform_fold_shift(String value) {

        List<String> strings = new ArrayList<>();

        int index = 0;

        while (index < value.length()) {

            strings.add(value.substring(index, Math.min(index + 2,value.length())));

            index += 2;
        }

        Integer count = 0;

        for (String element: strings) {

            count += Integer.parseInt(element);

        }

        String result = count.toString();

        return result.substring(result.length() - 2);
    }
}
