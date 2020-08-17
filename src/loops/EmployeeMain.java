package loops;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		EmployeePojo e1=new EmployeePojo(101,"Ramesh",20000);
		e1.display();
		
		//Polymorphic objects
		//dynamic method Dispaching
		EmployeePojo m1=new ManagerPojo(102,"Suresh",40000,2000);
		m1.display();
		//Down Casting
		System.out.println(((ManagerPojo)m1).getComm());
		
		
		
		
		
		

	}

}
