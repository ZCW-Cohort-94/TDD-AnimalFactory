package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
    public void testAdd() {
        String catName = "Fluffy";
        Date date = new Date();
        Cat cat = AnimalFactory.createCat(catName, date);
        CatHouse.add(cat);
        Assert.assertEquals(new Integer(1), CatHouse.getNumberOfCats());
    }

    @Test
    public void testRemove() {
        String catName = "Fluffy";
        Date date = new Date();
        int id = 123;
        Cat cat = new Cat(catName, date, id);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Assert.assertEquals(new Integer(0), CatHouse.getNumberOfCats());
    }

    @Test
    public void testGetCartById() {
        String catName = "Fluffy";
        Date date = new Date();
        int id = 123;
        Cat cat = new Cat(catName, date, id);
        CatHouse.add(cat);
        Assert.assertEquals(cat, CatHouse.getCatById(123));
    }

    @Test
    public void testgetNumberOfCats() {
        String catName = "Fluffy";
        Date date = new Date();
        int id = 123;
        Cat cat1 = new Cat(catName, date, id);
        CatHouse.add(cat1);
        Assert.assertEquals(new Integer(1), CatHouse.getNumberOfCats());
    }
}

