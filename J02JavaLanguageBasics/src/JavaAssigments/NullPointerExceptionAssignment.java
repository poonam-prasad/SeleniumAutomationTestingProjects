package JavaAssigments;

public class NullPointerExceptionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=null;
		
		try
		{
		if(str.equals("Test"))
			System.out.println("They are Same");
		
		else
		System.out.println("Not Same");
		}	
			
		catch(NullPointerException ex)
		{
			System.out.println("Null pointer exeption caught");
			System.out.println("Enter Test value in String variable str");
			
		}

}
}