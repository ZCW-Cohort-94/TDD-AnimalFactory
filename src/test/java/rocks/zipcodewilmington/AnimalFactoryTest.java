package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import org.junit.Assert;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        String dogName = "Rocky";
        Date date = new Date();
        Dog dog = AnimalFactory.createDog(dogName, date);
        String expectedDogName = dog.getName();
        Date expectedDate = dog.getBirthDate();
        Assert.assertEquals(dogName, expectedDogName);
        Assert.assertEquals(date, expectedDate);
    }

    @Test
    public void testCreateCat() {
        String catName = "Fluffy";
        Date date = new Date();
        Cat cat = AnimalFactory.createCat(catName, date);
        String expectedCatName = cat.getName();
        Date expectedDate = cat.getBirthDate();
        Assert.assertEquals(catName, expectedCatName);
        Assert.assertEquals(date, expectedDate);
    }

}
