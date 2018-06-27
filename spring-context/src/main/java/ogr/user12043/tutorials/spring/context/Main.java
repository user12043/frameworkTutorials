package ogr.user12043.tutorials.spring.context;

import ogr.user12043.tutorials.spring.context.model.Company;
import ogr.user12043.tutorials.spring.context.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user12043 on 27.06.2018
 * Part of project: tutorials
 */
public class Main {

    private static void separate(String title) {
        System.out.println("================================ " + title + " ========================================");
    }

    public static void main(String[] args) {
        getFromXML();
    }

    //<editor-fold desc="Using XML configuration" defaultstate="collapsed">

    /**
     * Using XML configuration.
     *
     * @see <a href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-xml-import" target="_top">Spring documentation about this</a>
     *
     * <i>Note: The xml files must be in your classpath if you pass their name directly. (E.g.: <b>"beans.xml"</b>)</i>
     */
    private static void getFromXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        separate("WITH PROPERTY SETTING");
        // Get person in xml file
//        Person person = (Person) context.getBean("person1");
        Person person = context.getBean("person1", Person.class);
        System.out.println(person);

        separate("IMPORT FROM ANOTHER XML");

        // Get person in beans.xml file which is imported from other xml file (other-beans.xml)
        Person otherPerson = context.getBean("otherPerson", Person.class);
        System.out.println(otherPerson);

        separate("NESTED OBJECTS");

        // Get company
        Company company1 = context.getBean("company1", Company.class);
        System.out.println(company1);

        separate("WITH SPECIFIC METHOD");

        // Get person created by factory bean
        Person personCreatedWithFactoryBean = context.getBean("personCreatedWithSpecificMethod", Person.class);
        System.out.println(personCreatedWithFactoryBean);

        separate("WITH CONSTRUCTOR");

        // Get person created with constructor. Like in "new Person(arg1, arg2)"
        Person createdWithConstructor = context.getBean("personCreatedWithConstructor", Person.class);
        System.out.println(createdWithConstructor);
        Person createdWithConstructor2 = context.getBean("personCreatedWithConstructor2", Person.class);
        System.out.println(createdWithConstructor2);
    }
    //</editor-fold>
}
