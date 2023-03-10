package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.net.Authenticator;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test

    public void addCatTest(){
        //Given
        CatHouse.clear();
        Date birthDate = new Date(2006 - 1900, 5, 3);
        Cat cat = AnimalFactory.createCat("Damian", birthDate);

        //When
        CatHouse.add(cat);

        //Then
        Assert.assertEquals(1, (int)CatHouse.getNumberOfCats());
    }

    @Test
    public void removeIdTest(){
        //Given
        CatHouse.clear();
        Date birthDate = new Date(2006 - 1900, 5, 3);
        Cat cat = AnimalFactory.createCat("Damian", birthDate);

        //When
        CatHouse.remove(cat);

        //Then
        Assert.assertEquals(0, (int)cat.getId());

    }

    @Test
    public void removeCatTest(){
        //Given
        CatHouse.clear();
        Date birthDate = new Date(2006 - 1900, 5, 3);
        Cat cat = AnimalFactory.createCat("Damian", birthDate);
        CatHouse.add(cat);

        //When
        CatHouse.remove(cat);

        //Then
        Assert.assertEquals(0, (int)CatHouse.getNumberOfCats());



    }

    @Test
    public void getCatByIdTest(){
        //Given
        CatHouse.clear();
        Date birthDate = new Date(2006 - 1900, 5, 3);
        Cat cat = AnimalFactory.createCat("Damian", birthDate);
        CatHouse.add(cat);

        //When
        int thisId = cat.getId();

        //Then
        Assert.assertEquals(cat, CatHouse.getCatById(thisId));

    }

    @Test
    public void getNumCatsTest(){
        //Given
        CatHouse.clear();
        Date birthDate = new Date(2006 - 1900, 5, 3);
        Cat cat = AnimalFactory.createCat("Damian", birthDate);

        //When
        CatHouse.add(cat);

        //Then
        Assert.assertEquals(1, (int)CatHouse.getNumberOfCats());
    }
}
