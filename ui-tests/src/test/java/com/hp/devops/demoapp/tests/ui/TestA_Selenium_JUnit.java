package com.hp.devops.demoapp.tests.ui;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 25/11/14
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 * test raluca
 * testDan123
 */
public class TestA_Selenium_JUnit {

    static private TestData testData;

    @BeforeClass
    static public void beforeAll() {
        testData = TestData.generate();
    }

    @Test
    public void testUIcaseA() {
        System.out.println("Proudly  running  test   " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if(testData.isMusicApp()){
            query = testData.getDriver().findElement(By.id("bandsList"));
            Assert.assertEquals(query.getTagName(), "div");
        } else {
            query = testData.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }
    
    @Test
    public void testLongName_1_0123456789_2_0123456789_3_0123456789_4_0123456789_5_0123456789_6_0123456789_7_0123456789_8_0123456789_9_0123456789_10_0123456789_11_0123456789_12_0123456789_13_0123456789_14_0123456789_15_0123456789_16_0123456789_17_0123456789_18_0123456789_19_0123456789_20_0123456789() {
        Assert.assertTrue(true);
    }

    @Category(SpecialTests.class)
    @Test
    public void testUIcaseB() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if(testData.isMusicApp()){
            query = testData.getDriver().findElement(By.id("totalVotes"));
            Assert.assertEquals(query.getTagName(), "div");
        } else {
            query = testData.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Test
    public void testUIcaseAlwaysPass() {
        System.out.println("Proudly  running test " + Thread.currentThread().getStackTrace()[1]);
        Assert.assertTrue(true);
    }

    @AfterClass
    static public void afterAll() {
        testData.getDriver().quit();
    }
}
