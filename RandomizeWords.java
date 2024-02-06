package mlc.objectandclasses.lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        for(int i = 0; i < words.length; i ++) {
            Random rnd = new Random();
            int changeIndex = rnd.nextInt(words.length);
            String word = words[i];
            words[i] = words[changeIndex];
            words[changeIndex] = word;
        }
        System.out.print(String.join(System.lineSeparator(), words));
    }
}
