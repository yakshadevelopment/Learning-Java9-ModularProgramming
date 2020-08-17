package loops;

public class ContinueAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					continue;
				}
				else{	
				System.out.println(i+" "+j);
				}
				
				System.out.println("No Same");
				
			}
		}
		
		

	}

}
