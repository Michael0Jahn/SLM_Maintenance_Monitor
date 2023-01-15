package at.hftw.slm_maintenance_monitor.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceControllerTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void message() throws Exception {
        String message=new MaintenanceController().Message();
        assertEquals("",
                message);
    }

    @Test
    void defaultMessage() {
        String message=new MaintenanceController().defaultMessage();
        assertEquals("Everything operates as expected",message);
    }

    @Test
    void serviceMessage() {
        String message=new MaintenanceController().serviceMessage("1234");
        assertEquals(message,message);
    }
}