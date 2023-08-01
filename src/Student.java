public class Student {
    private String name;
    private int age;
    private String address;
    private Season season;

    public Student(Season season) {
        this.season = season;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "season=" + season +
                '}';
    }
}
