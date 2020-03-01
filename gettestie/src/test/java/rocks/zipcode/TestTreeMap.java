package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {
    @Test
    public void TestTreeM(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khalil", 1977);
        TreeMap<String, Integer> newMap = new TreeMap<String, Integer>();
        //when
        newMap.put(khalil.getName(), khalil.getYearOfBirth());
        newMap.put(khaliah.getName(), khaliah.getYearOfBirth());
        boolean expected = newMap.containsKey(khalil.getName());
        //then
        Assert.assertTrue(expected);
    }
}
