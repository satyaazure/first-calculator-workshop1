package se.lexicon;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runApp = true;
        int num1;
        int num2;
        String operation;
        System.out.println("Enter number");
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2 = scanner.nextInt();
        System.out.println("choose operations");
        System.out.println("1 : Addition \n 2 : Subtraction \n 3 : Multiply \n 4 : Divide \n 0 : Exit");
        }
    }