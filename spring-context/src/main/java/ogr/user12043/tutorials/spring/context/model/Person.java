package ogr.user12043.tutorials.spring.context.model;

/**
 * Created by user12043 on 27.06.2018
 * Part of project: tutorials
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person name: " + this.name + "\nAge:" + this.age;
    }
}
