package ogr.user12043.tutorials.spring.context;

import ogr.user12043.tutorials.spring.context.model.Person;

/**
 * Created by user12043 on 27.06.2018
 * Part of project: tutorials
 */
public class CustomModelCreator {
    public Person createPerson() {
        Person person = new Person();
        person.setName("Custom created person");
        person.setAge(52);
        return person;
    }
}
