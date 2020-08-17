package loops;

public class StringClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]={"Ram","Shyam","Sita","Gita","Ramesh"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length-1;j++)
			{
			if(names[i].compareTo(names[j])>0)
			{
				String temp=names[i];
				names[i]=names[j];
				names[j]=temp;
			}
			}
		}
		System.out.println("-----------------------------");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		

	}

}
