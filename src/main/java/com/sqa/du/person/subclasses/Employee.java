/**
 * 
 */
package com.sqa.du.person.subclasses;

/**
 * @author dancalif
 *
 */
public class Employee extends Person {
	private int employeeId;
	private String companyName;

	public Employee() {
		super();
		this.employeeId = 1;
		this.companyName = "No name";
	}

	public Employee(String name, int age, double income, int employeeId, String companyName) {
		super(name, age, income);
		this.employeeId = employeeId;
		this.companyName = companyName;
	}

	@Override
	public int calcStressLevel() {
		return super.calcStressLevel() * 2;
	}

	@Override
	public double determinePay() {
		return getIncome() * 3;
	}

	@Override
	public void doWork() {
		System.out.println("Yippie, " + this.getName() + " is not doing any work!");
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	private int getIncome() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		String parentString = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(parentString);
		builder.append("Employee [employeeId=");
		builder.append(employeeId);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append("]");
		return builder.toString();
	}

}
