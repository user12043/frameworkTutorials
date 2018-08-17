package ogr.user12043.tutorials.jpaInheritance;

import ogr.user12043.tutorials.jpaInheritance.dao.VehicleDao;
import ogr.user12043.tutorials.jpaInheritance.model.Car;
import ogr.user12043.tutorials.jpaInheritance.model.Vehicle;
import ogr.user12043.tutorials.jpaInheritance.util.Utils;

/**
 * Created by ME99735 on 16.08.2018 - 11:35
 * part of project: testProject-maven
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("cwd: " + System.getProperty("user.dir"));
        // Add a car and then see database for understand what happened in background by hibernate
        Utils.getEntityManager().getTransaction().begin();

        Vehicle car = new Car("car1", "Toyota", 90, "araba1");
        VehicleDao vehicleDao = new VehicleDao();
        vehicleDao.saveVehicle(car);

        Utils.getEntityManager().getTransaction().commit();
        Utils.closeDatabase();
    }
}
