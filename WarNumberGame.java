package mlc.advanced.setsandmaps.lab;

import java.util.*;
import java.util.stream.Collectors;

public class WarNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstPlayer  = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        for (int i = 1; i <= 50; i ++) {
            int firstPlayerNumber = firstPlayer.iterator().next();
            int secondPlayerNumber = secondPlayer.iterator().next();

            firstPlayer.remove(firstPlayerNumber);
            secondPlayer.remove(secondPlayerNumber);

            if(firstPlayerNumber > secondPlayerNumber) {
                firstPlayer.add(firstPlayerNumber);
                firstPlayer.add(secondPlayerNumber);
            } else if(firstPlayerNumber < secondPlayerNumber) {
                secondPlayer.add(firstPlayerNumber);
                secondPlayer.add(secondPlayerNumber);
            }

            if(firstPlayer.isEmpty() || secondPlayer.isEmpty())
                break;
        }

        if(firstPlayer.size() == secondPlayer.size())
            System.out.println("Draw!");
        else
            if(firstPlayer.size() > secondPlayer.size())
                System.out.println("First player win!");
            else
                System.out.println("Second player win!");
    }
}
