package rocks.zipcode;

import org.junit.Assert;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("khalil");
        String expected = "khalil";
        String actual = stack.pop();
        Assert.assertEquals(expected, actual);
    }


}
