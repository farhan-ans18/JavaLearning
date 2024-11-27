package classAssigment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a File object representing the input file
        File file = new File("D:\\input.txt"); // Using your specified file path

        // Create a Scanner object to read from the file
        Scanner sc = new Scanner(file); // Assumes the file exists

        // Initialize sum to 0
        int sum = 0;

        // Loop through each number in the file and add it to the sum
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }

        // Print the sum using System.out.println()
        System.out.println("The sum is: " + sum);

        // Close the Scanner object
        sc.close();
    }
}