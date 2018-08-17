package ogr.user12043.tutorials.jpaInheritance.dao;

import ogr.user12043.tutorials.jpaInheritance.model.Vehicle;
import ogr.user12043.tutorials.jpaInheritance.util.Utils;

/**
 * Created by ME99735 on 16.08.2018 - 11:35
 * part of project: testProject-maven
 */
public class VehicleDao {
    // Saves vehicle object
    public void saveVehicle(Vehicle vehicle) {
        if (vehicle.getId() != null) { // If has an id, then update
            Utils.getEntityManager().merge(vehicle);
        } else { // hasn't an id, then persist
            Utils.getEntityManager().persist(vehicle);
        }
    }
}
