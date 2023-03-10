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
    public void newDogTest(){
        //Given
        String name= "Pupper";
        Date birthDate = new Date(2020 - 1900, 4, 20);
        Integer id = 8;

        //When
        Dog dog = new Dog(name, birthDate, id );

        //Then
        Assert.assertEquals("Pupper", dog.getName());
        Assert.assertEquals(birthDate, dog.getBirthDate());
        Assert.assertEquals(8, (int)dog.getId());
    }

    @Test
    public void DogSpeakTest() {
        String name = "";
        Date birthDate = new Date(2012 - 1900, 5, 15);
        //Given
        Dog dog = new Dog(name, birthDate, 5);

        //When
        dog.speak();

        //Then
        Assert.assertEquals("bark!", dog.speak());
    }

    @Test
    public void setDogBirthdateTest(){
        // Given
        Date birthDate = new Date(1999 - 1900, 7, 20);
        Date fixedBirthDate = new Date(1998 - 1900, 5, 19);
        Dog dog = new Dog("",birthDate , 6);

        //When
        dog.setBirthDate(fixedBirthDate);

        //Then
        Assert.assertEquals(fixedBirthDate, dog.getBirthDate());

    }

    @Test
    public void DogEatTest(){
        //Given
        Date birthDate = new Date(2005 - 1900, 4, 21);
        Dog dog = new Dog("", birthDate, 0);
        Food food = new Food();

        //When
        dog.eat(food);

        //Then
        Assert.assertEquals(1 , ((int)dog.getNumberOfMealsEaten()));

    }

    @Test
    public void getIdTest(){
        //Given
        Date birthDate = new Date(2015 - 1900, 8, 30);
        Dog dog = new Dog("", birthDate, 9);

        //Then
        Assert.assertEquals(9, (int) dog.getId());

    }

    @Test
    public void animalInheritanceTest(){
        //Given
        Date birthDate = new Date(2019 - 1900, 6, 10);
        Dog dog = new Dog("Bob", birthDate, 1);

        //Then
        Assert.assertEquals(true, dog instanceof Animal);


    }

    @Test
    public void mammalInheritanceTest(){
        //Given
        Date birthDate = new Date(2019 - 1900, 6, 10);
        Dog dog = new Dog("Bob", birthDate, 1);

        //Then
        Assert.assertEquals(true, dog instanceof Mammal);

    }





}
