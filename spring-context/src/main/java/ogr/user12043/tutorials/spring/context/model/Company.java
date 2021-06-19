package ogr.user12043.tutorials.spring.context.model;

import java.util.List;

/**
 * Created by user12043 on 27.06.2018
 * Part of project: tutorials
 */
public class Company {
    private String name;
    private Person owner;
    private List<Person> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Person> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        StringBuilder employeesString = new StringBuilder();
        for (Person employee : employees) {
            employeesString.append(employee.toString()).append("\n");
        }
        return "Company Name: " + name
                + "\n" + "Owner\n" + owner
                + "\nEMPLOYEES:\n" + employeesString;
    }
}
