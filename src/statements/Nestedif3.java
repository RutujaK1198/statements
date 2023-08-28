package statements;

public class Nestedif3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=20,num2=10,num3=45;
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Maximum number "+num1);
			}
			else
			{
				System.out.println("Max number "+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Maximum number "+num2);
			}
			else
			{
				System.out.println("Maximum number "+num2);
			}
		}
}
	}
	
	

