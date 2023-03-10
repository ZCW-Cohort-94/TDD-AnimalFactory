package rocks.zipcodewilmington;

import com.google.inject.internal.util.MapMaker;
import com.sun.jdi.InterfaceType;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
import java.util.Optional;

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
    public void setNameTest(){
        //Given
        String name = "Doug";

        //When
        Date birthDate = new Date(2022 - 1900, 2, 20);
        Cat cat = new Cat( "Kevin", birthDate, 1){
        };
        cat.setName(name);

        //Then
        Assert.assertEquals("Doug", cat.getName());
    }

    @Test
    public void catSpeakTest() {
        String name = "";
        Date birthDate = new Date(2012 - 1900, 5, 15);
        //Given
        Cat cat = new Cat(name, birthDate, 5);

        //When
        cat.speak();

        //Then
        Assert.assertEquals("meow!", cat.speak());
    }

        @Test
        public void setCatBirthdateTest(){
        // Given
            Date birthDate = new Date(1999 - 1900, 7, 20);
            Date fixedBirthDate = new Date(1998 - 1900, 5, 19);
            Cat cat = new Cat("",birthDate , 6);

        //When
            cat.setBirthDate(fixedBirthDate);

        //Then
            Assert.assertEquals(fixedBirthDate, cat.getBirthDate());

        }

        @Test
        public void eatTest(){
        //Given
            Date birthDate = new Date(2005 - 1900, 4, 21);
            Cat cat = new Cat("", birthDate, 0);
            Food food = new Food();

        //When
            cat.eat(food);

        //Then
            Assert.assertEquals(1 , ((int)cat.getNumberOfMealsEaten()));

        }

        @Test
        public void getIdTest(){
        //Given
            Date birthDate = new Date(2015 - 1900, 8, 30);
            Cat cat = new Cat("", birthDate, 9);

        //Then
            Assert.assertEquals(9, (int) cat.getId());

        }

        @Test
        public void animalInheritanceTest(){
        //Given
            Date birthDate = new Date(2019 - 1900, 6, 10);
            Cat cat = new Cat("Bob", birthDate, 1);

        //Then
            Assert.assertEquals(true, cat instanceof Animal);


        }

        @Test
    public void mammalInheritanceTest(){
        //Given
            Date birthDate = new Date(2019 - 1900, 6, 10);
            Cat cat = new Cat("Bob", birthDate, 1);

        //Then
            Assert.assertEquals(true, cat instanceof Mammal);

        }
    }

