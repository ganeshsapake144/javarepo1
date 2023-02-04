package variableTypes;

public class Hr {

	public static void main(String[] args)
	{
		Employee sachin=new Employee();// created object of Employee class
		
		Employee.team="Sachin tendulkar";
		Employee.team="Batting";
		Employee.emp_id=10;
		sachin.emp_gender='M';
		Employee.emp_salary=1234.123f;
		Employee.team="MI";
		
		sachin.emp_info(); //calling method
		
		Employee virendra=new Employee();
		virendra.emp_name="virendra shehvagh";
		virendra.emp_dept="Batting";
		virendra.emp_id=44;
		virendra.emp_gender='M';
		virendra.emp_salary=14567.3254f;
		Employee.team="Delhi";
		virendra.emp_info();
		
				
		
		
	
	}

}
