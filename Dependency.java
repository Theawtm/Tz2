package myjava;

import myjava.Operations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Dependency {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("times.csv");
            writer.write("Number of Numbers,Execution Time (ms)\n");

            for (int i = 10000; i <= 1000000; i += 10000) {
                String[] numsArray = generateNumbers(i);
                int[] intNumsArray = convertToIntArray(numsArray);

                long startTime = System.currentTimeMillis();
                Operations._sum(intNumsArray);
                long endTime = System.currentTimeMillis();
                long executionTime = endTime - startTime;

                writer.write(i + "," + executionTime + "\n");
            }

            writer.close();
            System.out.println("График в файле times.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] generateNumbers(int count) {
        Random random = new Random();
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i] = String.valueOf(random.nextInt(100));
        }
        return arr;
    }

    private static int[] convertToIntArray(String[] strArray) {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }
}
