package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {
    @Test
    public void TestLinkedL(){
        //given
        Person khalil = new Person("khalil", 1982);
        Person khaliah = new Person("khaliah", 1977);
        LinkedList<String> newList = new LinkedList();

        //when
        newList.add(khalil.getName());
        newList.addFirst(khaliah.getName());
        String expected = "khaliah";
        String actual = newList.getFirst();
        //then
        Assert.assertEquals(expected, actual);
    }
}
