package edu.xavier.csci;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest{
    @Test public void testAddTwoIntegers(){
        Calculator test1 = new Calculator();
        assertEquals(4, test1.add(3,1));
        assertEquals(7, test1.add(5,2));
        assertEquals(8, test1.add(4,4));
    }

    @Test public void testAddMoreThanTwoIntegers(){
        Calculator test2 = new Calculator();
        assertEquals(8, test2.add(4,1,3));
        assertEquals(12, test2.add(7,3,2));
        assertEquals(10, test2.add(4,3,3));
    }

}