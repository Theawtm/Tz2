package myjava;

import org.junit.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class calculaTest {

    @Test
    public void test_1() {
        try {
            File f = new File("TestFiles/test_1");
            Scanner scanner = new Scanner(f);
            String[] nums = scanner.nextLine().split(" ");
            Assert.assertEquals(5, Operations._min(nums));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_2() {
        try {
            File f = new File("TestFiles/test_2");
            Scanner scanner = new Scanner(f);
            String[] nums = scanner.nextLine().split(" ");
            Assert.assertEquals(99, Operations._max(nums));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_3() {
        try {
            File f = new File("TestFiles/test_3");
            Scanner scanner = new Scanner(f);
            String[] nums = scanner.nextLine().split(" ");
            Assert.assertEquals(214, Operations._sum(nums));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_4() {
        try {
            File f = new File("TestFiles/test_4");
            Scanner scanner = new Scanner(f);
            String[] nums = scanner.nextLine().split(" ");
            Assert.assertEquals(28911168, Operations._mult(nums));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ownProvTest_1() {
        try {
            File f = new File("TestFiles/OwnTest_1");
            Scanner scanner = new Scanner(f);
            String[] nums = scanner.nextLine().split(" ");
            Assert.assertEquals(2, Operations._min(nums));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ownProvTest_2() {
        try {
            File f = new File("TestFiles/OwnTest_2");
            Scanner scanner = new Scanner(f);
            String[] nums = scanner.nextLine().split(" ");
            Assert.assertEquals(467, Operations._mult(nums));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ownProvTest_3() {
        try {
            File f = new File("TestFiles/OwnTest_3");
            Scanner scanner = new Scanner(f);
            String[] nums = scanner.nextLine().split(" ");
            Assert.assertEquals(0, Operations._mult(nums));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ownProvTest_4() {
        try {
            File f = new File("TestFiles/OwnTest_4");
            Scanner scanner = new Scanner(f);
            String[] nums = scanner.nextLine().split(" ");
            Assert.assertEquals(-97, Operations._min(nums));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
