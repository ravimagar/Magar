package testng.exception;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExpectedExceptionsAttribute {

    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
    public void checkExceptionAttribute() {
        String s = null;
        System.out.println(s.length());
    }

    @Test(expectedExceptions = {IOException.class})          //Passes
    public void exceptionTestOne() throws Exception {
        throw new IOException();
    }

    @Test(expectedExceptions = {IOException.class, NullPointerException.class})      //Fails
    public void exceptionTestTwo() throws Exception {
        throw new Exception();
    }
}
