package com.mdtalalwasim.firebase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mdtalalwasim.firebase.entity.Notifications;
import com.mdtalalwasim.firebase.service.NotificationService;

@RestController
@RequestMapping("/api/notification")
public class NotificationsRestController {
	
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping("/topic")
	public ResponseEntity<String> sendNotification(@RequestBody Notifications notificationsRequest){
		try {
			String response = notificationService.sendMessage(notificationsRequest);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).body("Erro while sending message :"+e.getMessage());
		}
	}
	
	
	
    @PostMapping("/device")
    public ResponseEntity<String> sendNotificationToDevice(@RequestParam String deviceToken, @RequestBody Notifications notificationsRequest) {
        try {
            String response = notificationService.sendMessageToSpecificDevice(deviceToken, notificationsRequest);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error while sending message to specific Device: " + e.getMessage());
        }
    }
	
	
}
