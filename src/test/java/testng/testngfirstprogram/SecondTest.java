package testng.testngfirstprogram;

import org.testng.annotations.Test;

public class SecondTest{

    @Test(groups = "smoke")
    void secondClassTest(){
        int a =10;
        int b = 0;
        System.out.println(a/b);
    }

    @Test(dependsOnMethods = "secondClassTest")
    void check(){
        System.out.println("Check ");
    }
}
