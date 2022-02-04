package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;

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
}