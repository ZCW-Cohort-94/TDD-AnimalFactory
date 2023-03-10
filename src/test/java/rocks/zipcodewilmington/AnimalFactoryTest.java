package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test

    public void createDogTest(){
        //Given
        String name = "Clifford";
        Date birthDate = new Date(2009 - 1900, 3, 20);

        //When

        DogHouse.add(AnimalFactory.createDog(name, birthDate));
        int amountDogs = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(1, amountDogs);
    }

    @Test

    public void createCatTest(){
        //Given
        String name = "Puss";
        Date birthDate = new Date(2019 - 1900, 2, 2);

        //When

        CatHouse.add(AnimalFactory.createCat(name, birthDate));
        int amountCats = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(1, (int) CatHouse.getNumberOfCats());
    }
}
