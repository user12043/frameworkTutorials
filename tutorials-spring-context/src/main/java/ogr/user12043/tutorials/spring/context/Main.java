package ogr.user12043.tutorials.spring.context;

import ogr.user12043.tutorials.spring.context.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user12043 on 27.06.2018
 * Part of project tutorials
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("person1");
        System.out.println(person);
    }
}
