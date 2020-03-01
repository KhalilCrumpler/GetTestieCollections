package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TestTreeSet {
    @Test
    public void TestTreeS(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khalil", 1977);
        TreeSet<String> newTs = new TreeSet<String>();

        //when
        newTs.add(khalil.getName());
        newTs.add(khaliah.getName());
        newTs.clear();
        Integer expected = 0;
        Integer actual = newTs.size();
        //then
        Assert.assertEquals(expected, actual);
    }
}
