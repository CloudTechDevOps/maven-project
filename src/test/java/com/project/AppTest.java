package com.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testLogin1() {
        App myApp = new App();
        Assert.assertEquals(0, myApp.userLogin("abc", "abc123"));
    }

    @Test
    public void testLogin2() {
        App myApp = new App();
        Assert.assertEquals(1, myApp.userLogin("abc", "abc@123"));
    }
     @Test
    public void testLogin3() {
        App myApp = new App();
        Assert.assertEquals(0, myApp.userLogin("abc", "abc@1234"));
    }
}
