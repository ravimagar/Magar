package testng.testngfirstprogram;

import org.testng.ITestListener;
import org.testng.annotations.*;
import testng.listener.ITestListenerExample;

@Listeners(ITestListenerExample.class)

public class TestNGFirstProgram {


    @Test
    public void runFirstProgramB(){
        System.out.println("Hiiiiiii B");
    }

    @Test
    public void runFirstProgramA(){
        System.out.println("Hiiiiiii A");
    }

    @Test
    public void runFirstProgramD(){
        System.out.println("Hiiiiiii D");
    }

    @Test
    public void runFirstProgramG(){
        System.out.println("Hiiiiiii G");
    }

}
