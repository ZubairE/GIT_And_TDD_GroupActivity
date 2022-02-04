package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewCarTest {

    private NewCar car1;
    private NewCar car2;


    @BeforeEach
    void setUp() {

    car1 = new NewCar();
    car2 = new NewCar();

    }


   @Test
   void testIdentity(){

        assertSame(car1, car2);

   }

   @Test
   void testEquality(){

   }

}