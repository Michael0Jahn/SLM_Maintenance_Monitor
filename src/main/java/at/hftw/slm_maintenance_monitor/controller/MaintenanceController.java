package at.hftw.slm_maintenance_monitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {
    private static String message = "";

    @GetMapping("/")
    public String Message(){
        return message;
    }
    @GetMapping("/status/default")
    public String defaultMessage(){
        message = "Everything operates as expected";
        return message;
    }

    @GetMapping("/status")
    public String serviceMessage(String newMessage){
        message = newMessage;
        return message;
    }
}
