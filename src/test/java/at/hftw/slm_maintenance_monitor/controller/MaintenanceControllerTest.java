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
        String TestMessage=new MaintenanceController().Message();
        assertEquals("1234",
                TestMessage);
    }

    @Test
    void defaultMessage() {
        String TestDefaultMessage=new MaintenanceController().defaultMessage();
        assertEquals("Everything operates as expected",TestDefaultMessage);
    }

    @Test
    void serviceMessage() {
        String TestServiceMessage=new MaintenanceController().serviceMessage("1234");
        assertEquals("1234",TestServiceMessage);
    }
}