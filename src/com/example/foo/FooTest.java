package com.example.foo;

import junit.framework.TestCase;

public class FooTest extends TestCase{

    public void testSumTwoNumbers() throws Exception {

        Foo target = new Foo();
        int result = target.sumTwoNumbers(1,1);
        assertEquals(2, result);
    }
}