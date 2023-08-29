package com.homeStudent.student;

public class StudentSingleton implements StudentInterface{
    private String name;
    private int age;

    public StudentSingleton(String name, int age) {
        this.name = name;
        this.age = age;
        toString();
    }

    public StudentSingleton() {
        this.name = "Yevhen";
        this.age = 40;
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
        return "StudentSingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
