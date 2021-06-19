package ogr.user12043.tutorials.spring.context.model;

import java.beans.ConstructorProperties;

/**
 * Created by user12043 on 27.06.2018
 * Part of project: tutorials
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    // use @ConstructorProperties when constructor-args in xml refers the names (constructor-based DI)
    // This is required only if the code will not be compiled with debug flag
    // https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-ctor-arguments-resolution
    @ConstructorProperties({"name", "age"})
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Pure set methods also will be used by spring. setName, setAge
    // Good practice is to use constructor-based DI for mandatory components and setter-based for optionals.

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
        return "\tPerson name: " + this.name + "\n\tAge: " + this.age;
    }
}
