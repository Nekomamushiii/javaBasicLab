package mlc.advanced.setsandmaps.lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> map = new LinkedHashMap<>();
        Arrays.stream(scanner.nextLine().split(" ")).forEach(
                numStr -> {
                    Double number = Double.parseDouble(numStr);
                    if(map.containsKey(number)) {
                        map.put(number, map.get(number) + 1);
                    } else {
                        map.put(number, 1);
                    }
                }
        );
        map.forEach((key, value) -> System.out.println(String.format("%.1f -> %d", key, value)));
    }
}
