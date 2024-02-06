package mlc.objectandclasses.lab;

public class Person {
    private String name;
    private int age;
    private String gender;
    private Boolean isMarried;

    public Person() {
        name = "Suld";
        age = 13;
        gender = "er";
        isMarried = false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    public void printAge() {
        System.out.println("age:" + age);
    }
}
