package date250.appassignA.test.model;

import dat250.appassignA.model.IoTDevice;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.Assert.assertNotNull;

public class CreateModelTest {
    private EntityManagerFactory emf;

    @Before
    public void setUp() {
        emf = Persistence.createEntityManagerFactory("g4-appassignA");
    }

    @Test
    public void testConnection() {
        EntityManager em = emf.createEntityManager();
        assertNotNull(em);

        em.getTransaction().begin();

        IoTDevice iotdevice = new IoTDevice();
        //setIsPrivate("False");
        em.persist(iotdevice);


        //Display all tables
        // Execute native SQL query to list all tables (H2 specific query)
        try {
            Connection connection = em.unwrap(Connection.class);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SHOW TABLES");
            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");
                System.out.println("Table: " + tableName);
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        em.getTransaction().commit();
        em.close();
    }

}
