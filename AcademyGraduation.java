package mlc.advanced.setsandmaps.lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> students = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for(; n > 0 ; n --) {
            String student = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
            double sum = 0d;
            for (double grade : grades)
                sum += grade;
            students.put(student, sum / grades.size());
        }
        students.forEach((student, avg) -> {
            System.out.println(student + " is graduated with " + avg);
        });
    }
}
