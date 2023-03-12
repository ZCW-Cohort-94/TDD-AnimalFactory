package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAdd() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        Assert.assertEquals(new Integer(1), DogHouse.getNumberOfDogs());
    }

    @Test
    public void testRemove() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = new Dog(name, birthDate, 123);
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Assert.assertEquals(new Integer(0), DogHouse.getNumberOfDogs());
    }

    @Test
    public void testRemoveById() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = new Dog(name, birthDate, 123);
        DogHouse.add(dog);
        DogHouse.remove(123);
        Assert.assertEquals(new Integer(0), DogHouse.getNumberOfDogs());
    }

    @Test
    public void testGetDogById() {
        String name = "Milo";
        Date date = new Date();
        int id = 123;
        Dog dog = new Dog(name, date, id);
        DogHouse.add(dog);
        Assert.assertEquals(dog, DogHouse.getDogById(123));
    }

    @Test
    public void testgetNumberOfDogs() {
        String name = "Milo";
        Date date = new Date();
        int id = 123;
        Dog dog = new Dog(name, date, id);
        DogHouse.add(dog);
        Assert.assertEquals(new Integer(1), DogHouse.getNumberOfDogs());
    }
}
