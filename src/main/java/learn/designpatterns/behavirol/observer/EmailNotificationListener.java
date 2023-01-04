package learn.designpatterns.behavirol.observer;

import java.io.File;

public class EmailNotificationListener implements EventListener {

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    public void update(String eventType, File file) {
         System.out.println("Email to " + email + ": Someone has performed "+eventType+ " with the following file " + file.getName());       
    }
    
}
