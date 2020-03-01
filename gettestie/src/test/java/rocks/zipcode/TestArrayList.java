package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {
    @Test
    public void TestArrayL(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khaliah", 1977);
        ArrayList<String> newList = new ArrayList<>();
        //when
        newList.add(khalil.getName());
        newList.add(khaliah.getName());
        Integer expected = 2;
        Integer actual = newList.size();

        //then
        Assert.assertEquals(expected, actual);
    }
}
