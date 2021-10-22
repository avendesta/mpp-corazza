package problem04.soln2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import problem04.Employee;

public class TestMain {

	@Test
	public void testSalary() {
        Employee e1 = new Employee("Andrew", "Reardon", 80000);
        Employee e2 = new Employee("Alice", "Richards", 101000);
        assertEquals(LibraryCompanion.compSalaryGreaterThan100000(e1), false);
        assertEquals(LibraryCompanion.compSalaryGreaterThan100000(e2), true);
	}
	
	@Test
	public void testLastName() {
		Employee e1 = new Employee("Thomas", "Blake", 111000);
        Employee e2 = new Employee("Andrew", "Reardon", 80000);
        assertEquals(LibraryCompanion.compLastNameAfterM(e1), false);
        assertEquals(LibraryCompanion.compLastNameAfterM(e2), true);
	}
	
	@Test
	public void testFullName() {
		Employee e1 = new Employee("Donald", "Trump", 100000);
		assertEquals(LibraryCompanion.getFullName(e1), "Donald Trump");
	}
}
