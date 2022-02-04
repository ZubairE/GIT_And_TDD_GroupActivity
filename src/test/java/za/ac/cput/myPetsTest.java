package za.ac.cput;
/*
    Breyton Ernstzen - 217203027
    GIT and TDD group excercise
    4 February 2022
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myPetsTest {
        private myPets myPets1;
        private myPets myPets2;
        private myPets myPets3;

    @BeforeEach
    void setUp() {
        //First step
        myPets1 = new myPets();
        myPets2 = new myPets();
        myPets3 = myPets1;
    }

    @Test
    void testEquality(){
        //Test for object equality
        assertEquals(myPets1,myPets3);
        assertEquals(myPets1,myPets1);

    }
}