package learn.designpatterns.creational.singleton;

public class ConnectionPool {
    //add a static instance variable
    private static ConnectionPool INSTANCE;

    //make the constructor private
    private ConnectionPool() {

    }

    //create a public static getInstance method
    public static ConnectionPool getInstance() {
        if(INSTANCE == null) {
            synchronized (ConnectionPool.class) {
                if(INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }
        return INSTANCE;
    }

}
