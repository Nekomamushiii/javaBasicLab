package mlc.advanced.setsandmaps.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cars = new LinkedHashSet<>();
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] array = input.split(", ");
            if(array[0].equals("IN"))
                cars.add(array[1]);
            else
                cars.remove(array[1]);
            input = scanner.nextLine();
        }
        if(cars.isEmpty())
            System.out.println("Parking Lot is Empty");
        else
            for(String car : cars)
                System.out.println(car);
    }
}
