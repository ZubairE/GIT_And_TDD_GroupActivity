package za.ac.cput;

/*
    Breyton Ernstzen - 217203027
    GIT and TDD group excercise
    4 February 2022
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/* Breyton Ernstzen - 217203027
         GIT and TDD group excercise
         4 February 2022
 */

class myPetDetailsTest {
    private myPets myPets1;
    private myPets myPets2;
    private myPets myPets3;

    @BeforeEach
    void setUp() {
        //First step
        myPets1 = new myPets("Milo", "Jack russel", "Dog", 4);
        myPets2 = new myPets("Jango", "Pitbull", "Dog", 4);
        myPets3 = myPets1;
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testEquality() {
        //Test for object equality
        //pass test
        assertEquals(myPets1, myPets3);
        assertEquals(myPets1, myPets1);

        //assertEquals("Rango",myPets1.getName()); Deliberate test failure
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @Disabled
    void testIdentity() {
        //Test for object identity
        //This test has been disabled
        assertSame(myPets1, myPets3);

        assertNotSame(myPets1, myPets2);
        assertNotSame(myPets3, myPets2);

    }

}
