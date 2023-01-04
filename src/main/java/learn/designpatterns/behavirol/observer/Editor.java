package learn.designpatterns.behavirol.observer;

import java.io.File;

public class Editor {
    public EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify("open", this.file);
    }

    public void saveFile() throws Exception {
        if(this.file != null){
            eventManager.notify("save", this.file);
        }else{
            throw new Exception("Please open the file first");
        }
    }
}
