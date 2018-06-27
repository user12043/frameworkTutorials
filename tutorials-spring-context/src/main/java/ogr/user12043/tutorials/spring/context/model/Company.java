package ogr.user12043.tutorials.spring.context.model;

/**
 * Created by user12043 on 27.06.2018
 * Part of project: tutorials
 */
public class Company {
    private String name;
    private Person owner;

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

    @Override
    public String toString() {
        return "Company Name: " + name + "\n" + "Owner\n\tPerson name:" + owner.getName() + "\n\tAge: " + owner.getAge();
    }
}
