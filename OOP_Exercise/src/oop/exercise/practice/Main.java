package oop.exercise.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employees = getEmployeeList();
		List<Developer> developers = getDeveloperList();
		List<TeamLeader> teamLeaders = getTeamLeaderList();
		
		System.out.println("Employee List");
		System.out.println("-------------");		
		employees.forEach((v) -> System.out.println(v.getLabel()));		
		System.out.println("");	
		
		System.out.println("Developer List");
		System.out.println("-------------");		
		developers.forEach((v) -> System.out.println(v.getLabel()));
		System.out.println("");	
		
		System.out.println("Team Leader List");
		System.out.println("-------------");
		teamLeaders.forEach((v) -> System.out.println(v.getLabel()));
	}

	private static List<Employee> getEmployeeList(){
		Employee emp1 = new Employee();
		emp1.setFirtName("Sisamouth");
		emp1.setLastName("Sinn"); 
		emp1.setBirthday( "23/8/1932"); 
		emp1.setSalary(1000);
		emp1.setHoliday("Sat-Sun");
		emp1.setYear(91);
		
		Employee emp2 = new Employee();  
		emp2.setFirtName("Sereysothea");
		emp2.setLastName("Ros");
		emp2.setBirthday( "1/1/1948");
		emp2.setSalary(1200);
		emp2.setHoliday("Sat-Sun");
		emp2.setYear(75);
		
		Employee emp3 = new Employee();
		emp3.setFirtName("Matt");
		emp3.setLastName("So");
		emp3.setBirthday( "1/1/1972");
		emp3.setSalary(1200);
		emp3.setHoliday("Sat-Sun");
		emp3.setYear(6);
		
		List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3));
		return employeeList;
	}
	
	private static List<Developer> getDeveloperList(){
		Developer dev1 = new Developer("Master Degree in Information Technology Engineering");
		dev1.setFirtName("Sometri");
		dev1.setLastName("Oeng");
		dev1.setSalary(1500);
		
		Developer dev2 = new Developer("From AE University");
		dev2.setFirtName("Jonh");
		dev2.setLastName("Doe");
		dev2.setSalary(2500);
		
		List<Developer> developerList = new ArrayList<Developer>(Arrays.asList(dev1,dev2));
		return developerList;
	}
	
	private static List<TeamLeader> getTeamLeaderList(){
		TeamLeader team1 = new TeamLeader();
		team1.setFirtName("Bill");
		team1.setLastName("Gates");
		team1.setProjectNum(1);
		
		TeamLeader team2 = new TeamLeader();   
		team2.setFirtName("Mark");
		team2.setLastName("Zuckerberg");
		team2.setProjectNum(1);
		
		List<TeamLeader> teamLeaderList = new ArrayList<TeamLeader>(Arrays.asList(team1,team2));
		return teamLeaderList;
	}
}
