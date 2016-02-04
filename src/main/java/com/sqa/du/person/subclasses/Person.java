package com.sqa.du.person.subclasses;

public class Person {
	private String name;

	private int age;
	private double income;
	private boolean happy;

	public Person() {
		super();
		this.name = "No name";
		this.age = 30;
		this.income = 0.0;
	}

	public Person(String name, int age, double income) {
		super();
		this.name = name;
		this.age = age;
		this.income = income;
	}

	public int calcStressLevel() {
		return 3;
	}

	public double determinePay() {
		return income * 1;
	}

	public void doWork() {
		System.out.println(this.getName() + " is not doing any work!");
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public double isIncome() {
		return income;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", income=");
		builder.append(income);
		builder.append(", happy=");
		builder.append(happy);
		builder.append("]");
		return builder.toString();
	}

}
