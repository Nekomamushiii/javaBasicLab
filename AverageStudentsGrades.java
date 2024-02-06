package mlc.advanced.setsandmaps.lab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> students = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(; n> 0; n--) {
            String[] array = scanner.nextLine().split(" ");
            if(!students.containsKey(array[0])) {
                List<Double> grades = new ArrayList<>();
                grades.add(Double.parseDouble(array[1]));
                students.put(array[0], grades);
            } else  {
                students.get(array[0]).add(Double.parseDouble(array[1]));
            }
        }

        students.forEach((key, value) -> {
            System.out.print(key + " -> ");
            double sum = 0;
            for (double grade : value) {
                sum += grade;
                System.out.printf("%.2f ", grade);
            }
            System.out.printf("(avg: %.2f)%n", sum / value.size());
        });
    }
}
