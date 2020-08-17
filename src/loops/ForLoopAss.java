package loops;

public class ForLoopAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=7;
		int i=0;
		for (i = 2; i <= no; i++){
			if (no % i == 0){
				break;
			}
		}
		
		if(no==i)
		{
			System.out.println("Prime No");
		}
		else{
			System.out.println("Not Prime No");
		}

	}

}
