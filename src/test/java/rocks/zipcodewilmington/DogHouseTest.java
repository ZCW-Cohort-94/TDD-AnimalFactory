package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
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
    public void testAddDog() {

        //Given
        DogHouse.clear();
        String name = "Dog";
        Date birthdate = new Date(2020 - 1900, 10, 31);
        Dog dog = AnimalFactory.createDog(name, birthdate);

        //When
        DogHouse.add(dog);

        //Then
        Assert.assertEquals(1, (int)DogHouse.getNumberOfDogs());

    }

    @Test
    public void testRemoveDogId(){
        //Given
        DogHouse.clear();
        String name = "Dog";
        Date birthdate = new Date(2020 - 1900, 10, 31);
        Dog dog = AnimalFactory.createDog(name, birthdate);

        //When
        DogHouse.remove(dog);

        //Then
        Assert.assertEquals(0, (int)dog.getId());

    }

    @Test
    public void testRemoveDog(){
        //Given
        DogHouse.clear();
        String name = "Dog";
        Date birthdate = new Date(2020 - 1900, 10, 31);
        Dog dog = AnimalFactory.createDog(name, birthdate);

        //When
        DogHouse.remove(dog);

        //Then
        Assert.assertEquals(0, (int)DogHouse.getNumberOfDogs());

    }

    @Test
    public void testGetDogById(){
        //Given
        DogHouse.clear();
        String name = "Dog";
        Date birthdate = new Date(2020 - 1900, 10, 31);
        Dog dog = AnimalFactory.createDog(name, birthdate);
        DogHouse.add(dog);

        //When
        int thisid = dog.getId();

        //Then
        Assert.assertEquals(dog, DogHouse.getDogById(thisid));

    }

    @Test
    public void getNumDogs(){
        //Given
        DogHouse.clear();
        String name = "Dog";
        Date birthdate = new Date(2020 - 1900, 10, 31);
        Dog dog = AnimalFactory.createDog(name, birthdate);

        //When
        DogHouse.add(dog);

        //Then
        Assert.assertEquals(1, (int)DogHouse.getNumberOfDogs());


    }
}

