package com.homeStudent.student;

public class StudentPrototype implements StudentInterface{
    private String name;
    private int age;

    public StudentPrototype(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StudentPrototype() {
        this.name = "Iryna";
        this.age = 40;
        toString();

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "StudentPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
