package loops;

public class ForLoopAss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
				System.out.print(" ");	
			for(int j=i;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}
