package com.hillel.berezhnoy.lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsTest {

    int [][] array = {{1,2,3},{4,5,6,}};

    @Test
    public void getAverage(){


        Assertions.assertEquals(3,ArrayUtils.getAverega(array));

    }


    @Test
    public void getNotAverege(){

        Assertions.assertNotEquals(3.2,ArrayUtils.getAverega(array));
    }

}
