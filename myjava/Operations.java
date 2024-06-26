package myjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        String Filepath = "TestFiles\\56 65 34 12 1 17 9.txt";

        try {
            File file = new File(Filepath);
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] s = line.split(" ");
            int[] numbers = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                numbers[i] = Integer.parseInt(s[i]);
            }

            System.out.println("Min: " + _min(numbers));
            System.out.println("Max: " + _max(numbers));
            System.out.println("Sum: " + _sum(numbers));
            System.out.println("Mult: " + _mult(numbers));

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("No such file");
            e.printStackTrace();
        }
    }

    public static int _min(int[] numbers) {
        int min = numbers[0];
        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int _max(int[] numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int _sum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static int _mult(int[] numbers) {
        int mult = 1;
        for (int n : numbers) {
            mult *= n;
        }
        return mult;
    }

}
