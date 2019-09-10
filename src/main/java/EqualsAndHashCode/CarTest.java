package EqualsAndHashCode;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void primitivesShouldBeEqual(){
        int i=4;
        int j=4;
        assertTrue(i==j);
    }

    @Test
    public void stringShouldBeEqual(){
        String hello1= "Hello";
        String hello2= "Hello";

        assertTrue(hello1==hello2);

    }

    @Test
    public void porscheShouldBeEqual(){


    }
}
