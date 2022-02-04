package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class myPetDetailsTest {
    private myPets myPets1;
    private myPets myPets2;
    private myPets myPets3;

    @BeforeEach
    void setUp() {
        //First step
        myPets1 = new myPets("Milo","Jack russel","Dog",4);
        myPets2 = new myPets("Jango","Pitbull","Dog",4);
        myPets3 = myPets1;
    }

    @Test
    @Timeout(value = 100,unit = TimeUnit.MILLISECONDS)
    void testEquality() {
        //Test for object equality
        //pass test
        assertEquals(myPets1, myPets3);
        assertEquals(myPets1, myPets1);

        //assertEquals("Rango",myPets1.getName()); Deliberate test failure
    }


    }
