package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    @Test
    public void TestIterate(){
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("a");
        newList.add("b");
        newList.add("c");
        Iterator newIterator = newList.iterator();
        newIterator.next();
        String expected = "b";
        String actual = newIterator.next().toString();
        Assert.assertEquals(expected, actual);

    }
}
