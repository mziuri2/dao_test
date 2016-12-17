
package ge.mziuri.daotest;

import ge.mziuri.test.CityDaoTest;
import java.io.IOException;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
    
    public static void main(String[] args) throws IOException {
        
        Result result = JUnitCore.runClasses(CityDaoTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
        
    }
    
}
