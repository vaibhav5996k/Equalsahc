package EqualsAndHashCode;
import org.junit.Test;

import java.sql.SQLOutput;

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
        String hello3= "H";
        hello3= hello3 + "ello";
        System.out.println(hello3);
        assertTrue(hello1.equals(hello3));

        assertTrue(hello1==hello2);

    }

    @Test
    public void porscheShouldBeEqual(){
        Car myPorsche1 = new Car("vaibhav","Porsche","silver");
        Car myPorsche2 = new Car("vaibhav","Porsche","silver");
//        myPorsche2=myPorsche1;
//        assertTrue(myPorsche1.equals(myPorsche2));

    }
}
