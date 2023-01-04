package learn.designpatterns.behavirol.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<String, List<EventListener>>();
    
    public EventManager(String... operations) {
        for(String operation : operations) {
            this.listeners.put(operation, new ArrayList<EventListener>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = this.listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = this.listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file){
        List<EventListener> users = this.listeners.get(eventType);
        for(EventListener user : users) {
            user.update(eventType, file);
        }
    }
}
