package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;

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
}