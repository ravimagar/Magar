package testng.testngfirstprogram;

import org.testng.annotations.*;

public class ParantTest {

    @BeforeSuite
    void beforeSuite() {
        System.out.println("before resources.suite executed");
    }

    @BeforeTest
    void beforeTestExecution() {
        System.out.println("before test execution");
    }

    @BeforeClass
    void beforeClassExecution() {
        System.out.println("Before class execution");
    }

    @AfterClass
    void AfterClassExecution() {
        System.out.println("After class execution");
    }

    @AfterTest
    void afterTestExecution() {
        System.out.println("After Test execution");
    }

    @AfterSuite
    void AfterSuite() {
        System.out.println("After resources.suite executed");
    }
}
