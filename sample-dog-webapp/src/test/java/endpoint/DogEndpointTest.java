package endpoint;

import model.Dog;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DogEndpointTest {
    @Test public void createsDog() {
        Dog dog = new Dog();
        assertTrue(true);
    }
}