package com.praveen.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
	
	public static void main(String[] args) {
		Employee e1= new Employee("Praveen",149903L,34,"Hyderabad");
		Employee e2= new Employee("Khaja",250005L,35,"Bangalore");
		Employee e3= new Employee("Varma",26767L,36,"Singapore");
		Employee e4= new Employee("Hari",89778L,43,"Hyderabad");
		Employee e5= new Employee("Krishna",22203L,38,"SouthAfrica");
		
		ArrayList<Employee> eList= new ArrayList<Employee>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		eList.add(e5);
		
		eList.stream()
		       .filter(e -> e.getEmpLocation().equalsIgnoreCase("Hyderabad"))
		       .forEach(System.out::println);
		
		eList.stream()
	       .filter(new Predicate<Employee>() {
	    	   public boolean test(Employee e) {
	    		   return "Hyderabad".equalsIgnoreCase(e.getEmpLocation());
	    	   }
	       })
	       .forEach(System.out::println);
		
		System.out.println(eList.stream()
	       .filter(e -> e.getEmpLocation().equalsIgnoreCase("Hyderabad"))
	       .sorted(new Comparator<Employee>(){
	    	   public int compare(Employee e1,Employee e2) {
	    		   return e1.getEmpName().compareToIgnoreCase(e2.getEmpName());
	    	   }
	       })
	       .findFirst().get());
		
		System.out.println(eList.stream()
		     .filter(e-> e.getEmpName().equalsIgnoreCase("praveen"))
		     .map(Employee::getEmpAge)
		     .findAny()
		     .orElse(0));
		     
		List<List> listOfListOfNumber = new ArrayList<>();
        listOfListOfNumber.add(Arrays.asList(2, 4));
        listOfListOfNumber.add(Arrays.asList(3, 9));
        listOfListOfNumber.add(Arrays.asList(4, 16));
        System.out.println(listOfListOfNumber);
        
        System.out.println(listOfListOfNumber.stream()
        .flatMap( list -> list.stream())
        .collect(Collectors.toList()));
        
        System.out.println(eList.stream()
             .map(Employee:: getEmpName)
             .collect(Collectors.joining("|")));
        
    	IntSummaryStatistics statistics= eList.stream()
   		     .mapToInt(Employee::getEmpAge)
   		     .summaryStatistics();
    	
    	System.out.println(statistics.getCount());
    	System.out.println(statistics.getSum());
    	System.out.println(statistics.getMin());
    	System.out.println(statistics.getMax());
    	System.out.println(statistics.getAverage());
		
    	Map<Boolean,List<Employee>> partition= eList.stream().collect(Collectors.partitioningBy(e -> e.getEmpLocation().equals("Hyderabad")));
    	System.out.println("Employees working in Hyderabad Location "+partition.get(true));
    	System.out.println("Employees working in other Location "+partition.get(false));
    	
    	
    	Map<String,List<Employee>> groupBy = eList.stream()
    			   .collect(Collectors.groupingBy(Employee::getEmpLocation));    	
    	System.out.println(groupBy);
    	
    	
    	Map<String,Set<String>> mappingBy = eList.stream()
    			   .collect(Collectors.groupingBy(Employee::getEmpLocation, 
    			      Collectors.mapping(Employee::getEmpName, Collectors.toSet())));
    	System.out.println(mappingBy);
	}
	
	

}

class Employee{
	private String empName;
	private Long empId;
	private String empLocation;
	private int empAge;
	public Employee(String empName, Long empId, int empAge,String empLocation) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empLocation = empLocation;
		this.empAge=empAge;
	}
	public String getEmpName() {
		return empName;
	}
	public Long getEmpId() {
		return empId;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public int getEmpAge() {
		return empAge;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAge=" + empAge + ", empLocation=" + empLocation + "]";
	}
	
}