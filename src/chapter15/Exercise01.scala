package chapter15

import org.junit.Test;
import org.junit.Assert.assertEquals

class Exercise01 {
    @Test(timeout = 100)
    def testAdd() = assertEquals(2, 1 + 1)
    @Test
    def testSub() = assertEquals(2, 4 - 2)
    @Test 
    def testMul() = assertEquals(2, 1 + 1)
    @Test (expected = classOf[ArithmeticException])
    def testDiv() = assertEquals(2, 4 / 0)    
}