/**
 * AccountTest.java
 * This is the Unit test class
 * @author Guy De La Cruz
 * 04 February 2022
 */

package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account1;
    private Account account2;
    private Account account3;

    @BeforeEach
    void setUp() {
        account1 = new Account();
        account2 = new Account();
        account3 = account1;
    }

    @Test
    void testIdentity(){

        assertSame(account1, account2);
        assertSame(account1, account3);
    }

    @Test
    void testEquality(){

        assertEquals(account1, account3);
    }

    /*@Test
    void testFailure(){
        assertEquals(account1, account3);
        fail("The two are not equal to each other");
    }*/

    @Test
    public void testTimeoutOne() throws Exception
    {
        TimeUnit.SECONDS.sleep(1);
    }

}