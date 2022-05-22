package testng.testngfirstprogram;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class FirstScriptWithTestNG {


    @Test(groups = "priti")
    void secondTest() {
        System.out.println("hii");
        Assert.assertEquals("Ganesh", "Amol", "String shuold be match");
    }


    @Test(groups = "sonam")
    void firstTest() {
        System.out.println("First Test execution");
    }

    @Test(dependsOnGroups = "priti")
    public void fifthTest(){
        System.out.println("Fifth Test execution");
    }

//    @Test
//    void lastTest(){
//        int a = 0;
//        int b = 1;
//        Assert.assertTrue(a==b, "both valus should same");
//    }
//
//    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
//    void fourthTest(){
//        System.out.println("Fourth Test");
//    }

}
