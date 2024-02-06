package mlc.objectandclasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!"end".equals(input)) {
            String[] inputs = input.split(" ");
            Student student = new Student();
            student.setFirstName(inputs[0]);
            student.setLastName(inputs[1]);
            student.setAge(Integer.parseInt(inputs[2]));
            student.setHomeTown(inputs[3]);
            studentList.add(student);
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for(Student student : studentList) {
            if(city.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }
    }

    public static class Student {
        private String firstName;
        private String lastName;
        private String homeTown;
        private int age;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

