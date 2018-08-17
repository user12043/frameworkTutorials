package ogr.user12043.tutorials.jpaInheritance.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by ME99735 on 16.08.2018 - 11:35
 * part of project: testProject-maven
 */
@Entity
@DiscriminatorValue("DISC_CAR")
public class Car extends Vehicle {
    @Column
    private int horsePower;

    @Column
    private String specialName;

    public Car() {
    }

    public Car(String name, String brand, int horsePower, String specialName) {
        super(name, brand);
        this.horsePower = horsePower;
        this.specialName = specialName;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName;
    }
}
