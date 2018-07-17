package labJUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {
		
	public static void main(String[] args) {
	
		Result result = JUnitCore.runClasses(MyClassTest.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		int fail = result.getFailureCount();
		
		System.out.println("Failed Tests: " + fail);
		
		int run = result.getRunCount();
		
		System.out.println("Test Run: " + run);
		
		int pass = run - fail;
		
		System.out.println("Passed Tests: " + pass);
	}
}