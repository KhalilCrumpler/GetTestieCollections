package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
    @Test
    public void TestArrayD(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khaliah", 1977);
        Person john = new Person("john", 1977);
        Deque<String> newDeque = new ArrayDeque<>();

        //when
        newDeque.add(khalil.getName());
        newDeque.add(khaliah.getName());
        newDeque.add(john.getName());
        String expected = "john";
        String actual = newDeque.getLast();

        //then
        Assert.assertEquals(expected, actual);
    }
}
