package lab;

import java.util.Comparator;

import assignment.Employee;

public class CalcPayLowestToHighestComparator implements Comparator<Employee>{

	 @Override
	    public int compare(Employee o1, Employee o2) {
	        return o2.getId() - o1.getId();
	    }
	}
    
    


