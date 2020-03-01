package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    @Test
    public void TestVec(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khalil", 1977);
        Vector newV = new Vector();

        //when
        newV.add(khalil.getName());
        newV.add(khaliah.getName());
        Integer expected = 2;
        Integer actual = newV.size();

        //then
        Assert.assertEquals(expected, actual);
    }
}
