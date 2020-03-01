package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable {

    @Test
    public void TestComp(){

        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khaliah", 1977);
        Integer khalilYear = 1982;
        Integer khaliahYear = 1977;

        //when
        Integer expected = 1;
        Integer actual = khalilYear.compareTo(khaliahYear);

        //then
        Assert.assertEquals(expected, actual);

    }
}
