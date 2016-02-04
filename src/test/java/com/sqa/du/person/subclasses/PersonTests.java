/**
 * 
 */
package com.sqa.du.person.subclasses;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author dancalif
 *
 */
public class PersonTests {

	@Test
	public void testEmployeeActions() {
		// Initialize and Create Array
		Person[] people = new Person[] { new Employee(), new Person(), new Employee("JF", 33, 5.0, 345, "SQA School"),
				new Person("John", 18, 20.0), new Employee("John", 18, 20.0, 405, "SF School"),
				new Person("JF", 33, 5.0), };
		// For each: Call Class Instance Methods
		for (Person p : people) {
			// Do Work
			p.doWork();
			// Calculate stress
			System.out.println("\tStress level: " + p.calcStressLevel());
			// Determine pay
			System.out.println("\tPay Amount: " + p.determinePay());
			// Call toString to get all details
			System.out.println("\tPerson Details: " + p.toString());

		}
	}

	@Test
	@Ignore
	public void testPersonActions() {
		// Initialize and Create Array
		Person[] people = new Person[] { new Person(), new Person("du", 37, 150.0), new Person("John", 18, 20.0) };
		// For each: Call Class Instance Methods
		for (Person p : people) {
			// Do Work
			p.doWork();
			// Calculate stress
			System.out.println("\tStress level: " + p.calcStressLevel());
			// Determine pay
			System.out.println("\tPay Amount: " + p.determinePay());
			// Call toString to get all details
			System.out.println("\tPerson Details: " + p.toString());

		}
	}

}
