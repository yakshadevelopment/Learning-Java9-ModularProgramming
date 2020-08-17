package loops;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Ramesh";
		String lastName="Sharma";
		String fullName=firstName.concat(" "+lastName);
		System.out.println(fullName);
		String emailId="ramesh.sharma@gmail.com";
		System.out.println(emailId.contains("gmail"));
		System.out.println(emailId.endsWith("gmail.com"));
		System.out.println(emailId.indexOf("@"));
		System.out.println(emailId.lastIndexOf("@"));
		System.out.println(emailId.substring(emailId.indexOf("@")+1));
		System.out.println(emailId.replace("ra", "ta"));
		
		//String,StringBuffer,StringBuilder
		
		

	}

}
