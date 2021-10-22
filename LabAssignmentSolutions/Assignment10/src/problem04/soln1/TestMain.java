package problem04.soln1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Arrays;
import java.util.stream.Stream;
import problem04.Employee;
import problem04.Main;

public class TestMain {

//	public static void main(String[] args) {
//		Result result = JUnitCore.runClasses(TestMain.class);
//		for (Failure failure : result.getFailures()) {
//	         System.out.println(failure.toString());
//	      }
//			
//	      System.out.println(result.wasSuccessful());
//	}
	
	@Test
	public void testAsString() {
		Stream<Employee> emps = Arrays.asList(
				new Employee("Joe", "Davis", 120000),
		        new Employee("Joe", "Stevens", 200000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000)).stream();
		assertEquals((new Main()).asString(emps), "Alice Richards, Joe Stevens");
	}
	

}
