package learn.designpatterns.creational.singleton;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ConnectionPoolTest {
    @Test
    public void testConnectionPool() {
        ConnectionPool obj1 = ConnectionPool.getInstance();
        ConnectionPool obj2 = ConnectionPool.getInstance();
        assertTrue("obj1 and obj2 both should be pointing to same object", obj1 == obj2);
    }
}
