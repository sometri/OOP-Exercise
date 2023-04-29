package oop.exercise.practice;

public class Developer extends Employee {
	private String comment;
	
	public Developer(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String getLabel() {
		return String.format("Name: %1$s %2$s, Comment: %3$s, Salary: %4$s", 
				getFirtName(),getLastName(),this.comment,getSalary());
	}
}
