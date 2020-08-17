package loops;

public class WhileAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=127321;
		int p=no;
		int rem=0;
		int rev=0;
		while(no!=0)
		{
			
			rem=no%10;
			rev=rem+rev*10; //4321
			
			no=no/10;
		}
		if(rev==p)
		System.out.print("Palindrom");
		else
			System.out.print("Not Palindrom");
		

	}

}
