package mlc.objectandclasses.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        System.out.println(new BigInteger(number1)
                .add(new BigInteger(number2)));
//        BigInteger number1 = new BigInteger(scanner.nextLine());
//        BigInteger number2 = new BigInteger(scanner.nextLine());
//        BigInteger sum = number1.add(number2);
//        System.out.println(sum);
    }
}
