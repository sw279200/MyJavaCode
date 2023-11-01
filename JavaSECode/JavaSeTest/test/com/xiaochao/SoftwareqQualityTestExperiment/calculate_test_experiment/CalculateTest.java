package com.xiaochao.SoftwareqQualityTestExperiment.calculate_test_experiment;


import com.xiaochao.SoftwareqQualityTestExperiment.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {
    Calculate calculate;
    @Test
    public void testAdd() {
        calculate = new Calculate();
        int result = calculate.add(2, 3);
        Assert.assertEquals("加法有问题", 5, result);
        /*
         * "加法有问题"：期望值和实际值不一致时，显示的信息
         * 5 ：期望值
         * result ：实际值
         * Assert 断言	assertEquals相等断言
         */
    }
    @Test
    public void testSubtract() {
        calculate = new Calculate();
        int result = calculate.subtract(12, 2);
        Assert.assertEquals("减法有问题", 10000, result); //故意设置减法期望值为10000
    }
    @Test
    public void testMultiply() {
        calculate = new Calculate();
        int result = calculate.multiply(2, 3);
        Assert.assertEquals("乘法有问题", 6, result);
    }
    @Test
    public void testDivide() {
        calculate = new Calculate();
        int result = calculate.divide(6, 3);
        Assert.assertEquals("除法有问题", 2, result);
    }
}
