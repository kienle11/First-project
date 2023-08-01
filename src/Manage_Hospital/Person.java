package Manage_Hospital;

public class Person {
    protected String name;
    protected int age;
    protected static int auId;

    public Person(String name, int age, int auId) {
        this.name = name;
        this.age = age;
        this.auId = ++auId;
    }
}
