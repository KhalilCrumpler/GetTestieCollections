package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    @Test
    public void TestPriorityQ(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khaliah", 1977);
        PriorityQueue<String> newP = new PriorityQueue<String>();

        //when
        newP.add(khalil.getName());
        newP.add(khaliah.getName());
        newP.poll();
        Integer expected = 1;
        Integer actual = newP.size();

        //then
        Assert.assertEquals(expected, actual);
    }
}
