package ogr.user12043.tutorials.spring.context.model;

/**
 * Created by ME99735 on 27.06.2018
 * Part of project build-from-scratch
 */
public class Person {
    private String name;
    private int age;


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
        return "Name: " + this.name + "\nAge:" + this.age;
    }
}
