package ogr.user12043.tutorials.jpaInheritance.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by ME99735 on 16.08.2018 - 11:35
 * part of project: testProject-maven
 */
public class Utils {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        }
        if (entityManager == null) {
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }

    public static void closeDatabase() {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
        if (entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
