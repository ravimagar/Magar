package testng.rerunfailtest;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class IAnnotationTransformRetryListner implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation testAnnotation, Class testClass,
                          Constructor testConstructor, Method tesMethod) {
        testAnnotation.setRetryAnalyzer(RerunFailTestScriptsWithIRetryAnalyzer.class);
    }
}
