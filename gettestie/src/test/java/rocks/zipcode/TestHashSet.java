package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {
    @Test
    public void TestHasSet(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khalil", 1977);
        HashSet myHash = new HashSet();

        //when
        Integer expected = 1;
        myHash.add(khalil.getName());
        myHash.add(khaliah.getName());
        Integer actual = myHash.size();

        //then
        Assert.assertEquals(expected, actual);
    }
}
