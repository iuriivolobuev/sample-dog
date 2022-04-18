package model;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class DogTest {
    @Test public void createsDog() {
        assertNotNull(new Dog());
    }
}