import myjava.Operations;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TestOperations {

    public static void main(String[] args) {
        int[] sizes = { 1000, 2500, 5000, 7500, 10000, 15000, 25000, 35000, 45000, 50000, 75000, 90000, 100000 }; // Размеры
                                                                                                                  // входных
                                                                                                                  // файлов
        long[] durations = new long[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int[] numbers = generateRandomArray(sizes[i]);

            long startTime = System.currentTimeMillis();
            Operations._sum(numbers);
            long endTime = System.currentTimeMillis();

            durations[i] = endTime - startTime;
        }

        for (int i = 0; i < sizes.length; i++) {
            System.out.println("File size: " + sizes[i] + ", Time: " + durations[i] + " ms");
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}