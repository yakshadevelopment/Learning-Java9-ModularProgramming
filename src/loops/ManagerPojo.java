package loops;

//Derived Class Of Employee
public class ManagerPojo extends EmployeePojo implements Bouncable{	
	private float comm;
	
	public ManagerPojo()
	{
		super();
		comm=0.0f;
	}
	public ManagerPojo(int empNoRemp,String empNameTemp,float empSaltemp,float comm)
	{
		super(empNoRemp,empNameTemp,empSaltemp);
		this.comm=comm;
		
	}
	

	//method Override
	public void display()
	{
		System.out.println("Manager Method2");
		super.display();
		System.out.println("Comm="+comm);
	}
	

	public float getSal()
	{
		return super.getSal()+comm;
	}
	
	public float getComm()
	{
		return comm;
	}
	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		
	}
	
	

}
