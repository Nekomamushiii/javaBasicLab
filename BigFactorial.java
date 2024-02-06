package mlc.objectandclasses.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger fact = new BigInteger("1");
        for(int i = 2; i <= n; i ++) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(fact);
    }
}
