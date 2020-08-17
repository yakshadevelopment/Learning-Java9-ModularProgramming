package loops;

public class EmployeePojo {
	
	private int empNo; //Encapsulation //instance vAriable,Class variable,Local variable,Constant
	private String empName;
	private float empSal;
	private static final String managernName="Vilas";
	
	
	public EmployeePojo()
	{
		System.out.println("default Constructor");
		empNo=0;
		empName="Unknown";
		empSal=0.0f;
		
	}
	public EmployeePojo(int empNoRemp)
	{
		System.out.println("default Constructor");
		empNo=empNoRemp;
		empName="Unknown";
		empSal=0.0f;
		
	}
	
	public EmployeePojo(int empNoRemp,String empNameTemp,float empSaltemp)
	{
		System.out.println("Para Constructor");
		empNo=empNoRemp;
		empName=empNameTemp;
		empSal=empSaltemp;
		
	}
	
	
	
	//instance method,class method,final method
	public void setValues(int empNoRemp,String empNameTemp,float empSaltemp){
		System.out.println("Method1");
		int x=0;
		empNo=empNoRemp;
		empName=empNameTemp;
		empSal=empSaltemp;
	}
	
	//instance method,class method,final method
		public void setValues(int empNoRemp,String empNameTemp){
			System.out.println("Method1");
			int x=0;
			empNo=empNoRemp;
			empName=empNameTemp;
			empSal=3000;
		}
		
		//instance method,class method,final method
		public void setValues(int empNoRemp){
			System.out.println("Method1");
			int x=0;
			empNo=empNoRemp;
			empName="Unknown";
			empSal=3000;
		}
	
	public static String getManager()
	{
		
		return managernName;
	}
	
	public void display()
	{
		System.out.println("Method2");
		System.out.println("empNo="+empNo+" Name="+empName+" sal="+empSal+" Manager="+managernName);
	}
	
	
	public float getSal()
	{
		return empSal;
	}
	
	

}
