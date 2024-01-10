package com.example.notification;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotificationController {
    @PostMapping("/notify")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> handleNotificationRequest(@RequestBody DeviceDetails deviceDetails) {
        Map<String, String> notificationMessage = new HashMap<>();
        notificationMessage.put("Notification:", "Name: " + deviceDetails.getDeviceName() + " (" + deviceDetails.getDeviceType() +
                ") has been successfully registered. Status: " +deviceDetails.getDeviceStatus());
        return notificationMessage;
    }
}
