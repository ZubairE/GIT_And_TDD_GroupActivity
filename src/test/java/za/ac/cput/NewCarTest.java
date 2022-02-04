package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewCarTest {

    private NewCar car1;
    private NewCar car2;
    private NewCar car3;

    @BeforeEach
    void setUp() {

    car1 = new NewCar();
    car2 = new NewCar();
    car3 = car1 ;

    }


   @Test
   void testIdentity(){

        assertSame(car1, car3);
   }

   @Test
   void testEquality(){

        assertEquals(car1, car2);
   }

}