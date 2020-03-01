package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;


public class TestHashMap{

    @Test
    public void TestHasMap(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khaliah", 1977);
        HashMap<String, Integer> map = new HashMap<>();

        //when
        map.put(khalil.getName(), khalil.getYearOfBirth());
        map.put(khaliah.getName(), khaliah.getYearOfBirth());
        boolean expected = map.containsKey(khalil.getName());
        boolean expected2 = map.containsKey(khaliah.getName());

        //then
        Assert.assertTrue(expected);
        Assert.assertTrue(expected2);
    }

    }




