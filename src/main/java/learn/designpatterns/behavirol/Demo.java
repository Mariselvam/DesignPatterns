package learn.designpatterns.behavirol;

import learn.designpatterns.behavirol.observer.Editor;
import learn.designpatterns.behavirol.observer.EmailNotificationListener;
import learn.designpatterns.behavirol.observer.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("/path/file"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("mailid@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}