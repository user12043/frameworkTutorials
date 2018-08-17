package ogr.user12043.tutorials.jpaInheritance.model;

import javax.persistence.*;

/**
 * Created by ME99735 on 16.08.2018 - 11:34
 * part of project: testProject-maven
 */
@Entity
// Switch between inheritance type and run to see difference

//<editor-fold desc="table per class" defaultstate="collapsed">
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//</editor-fold>

//<editor-fold desc="single table inheritance" defaultstate="collapsed">
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "DISC_TYPE")
//@DiscriminatorValue(value = "DISC_VEHICLE")
//</editor-fold>
public class Vehicle {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String brand;

    public Vehicle() {
    }

    public Vehicle(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
