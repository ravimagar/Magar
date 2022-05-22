package testng.listener;

import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ITestListenerExample.class)
//@Listeners(TestListnerAdapterExample.class)

public class ITestListnerRunDemo {

    @Test
    public void testB() {
        System.out.println("test B");
    }

    @Test
    public void testA() {
        System.out.println("test A");
    }

    @Test
    public void testD() {
        System.out.println("test D");
        Assert.assertTrue(false);
    }

    @Test
    public void testG() {
        System.out.println("test G");
    }

}
