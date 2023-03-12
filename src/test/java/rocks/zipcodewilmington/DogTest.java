package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testtSpeak() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog("Milo", new Date(), 123);
        Assert.assertEquals("bark!", dog.speak());
    }

    @Test
    public void testSetBirthDate() {
        String name = "Milo";
        Date date = new Date();
        int id = 123;
        Dog dog = new Dog(name, date, id);
        Assert.assertEquals(date, dog.getBirthDate());
    }

    @Test
    public void testEat() {
        String name = "Milo";
        Date date = new Date();
        int id = 123;
        Dog dog = new Dog(name, date, id);
        dog.eat(new Food());
        Assert.assertEquals(new Integer(1), dog.getNumberOfMealsEaten());
    }

    @Test
    public void testGetId() {
        String name = "Milo";
        Date date = new Date();
        int id = 123;
        Dog dog = new Dog(name, date, id);
        dog.eat(new Food());
        Assert.assertEquals(new Integer(123), dog.getId());
    }

    @Test
    public void testInstanceOfAnimal() {
        String name = "Milo";
        Date date = new Date();
        int id = 123;
        Dog dog = new Dog(name, date, id);
        dog.eat(new Food());
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testInstanceOfMammal() {
        String name = "Milo";
        Date date = new Date();
        int id = 123;
        Dog dog = new Dog(name, date, id);
        dog.eat(new Food());
        Assert.assertTrue(dog instanceof Mammal);
    }
}
