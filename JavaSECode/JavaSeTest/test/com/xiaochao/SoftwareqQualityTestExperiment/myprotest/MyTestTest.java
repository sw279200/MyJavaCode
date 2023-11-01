package com.xiaochao.SoftwareqQualityTestExperiment.myprotest;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyTestTest {
    @Test
    public void testWork() {
        int result = work(4, 5, 6);
        assertEquals(result, 25);
    }

    @Test
    public void testWorkWithMultipleConditions() {
        int result = work(4, 7, 10);
        assertEquals(result, 3);
    }

    @Test
    public void testWorkWithNegativeValues() {
        int result = work(-3, 5, 6);
        assertEquals(result, -5);
    }

    public int work(int x,int y,int z)
    {
        int k = 0;
        int j = 0;
        if(x>3&&z<10){
            k = x*y-1;
            j = k-z;
        }
        if((x==4)||(y<5)){
            j = x*y+10;
            j =j%3;
        }
        return j;
    }
}