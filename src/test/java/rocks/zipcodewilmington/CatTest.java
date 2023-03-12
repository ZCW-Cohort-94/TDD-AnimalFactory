package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //test setName()
        cat.setName("Fluffy");
        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Assert.assertEquals("Fluffy", retrievedName);
    }

    @Test
    public void testSpeak() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertEquals("meow!", cat.speak());
    }

    @Test
    public void testSetBirthDate() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        //test setBirthDate()
        cat.setBirthDate(new Date());
        Date retrievedDate = cat.getBirthDate();
        Assert.assertEquals(givenBirthDate, retrievedDate);
    }

    @Test
    public void testVoidEat() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food();
        cat.eat(food);
        Assert.assertEquals(new Integer(1), cat.getNumberOfMealsEaten());
    }

    @Test
    public void testGetId() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 120;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertEquals(new Integer(120), cat.getId());
    }

    @Test
    public void testInstanceOfAnimal() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 120;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testInstanceOfMammal() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 120;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Mammal);
    }
}
