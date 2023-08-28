package statements;

public class Nestedif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=40;
		String gender= "Male";
		if (age>=18)
		{
			System.out.println("The person is legal voter");
			if (gender=="Male" && age<21)
			{
				System.out.println("The person dont have valid age for marraige");
				if(age<30)
				{
					System.out.println("Eligible to apply for govt jobs");
					
			}
				else
				{
					System.out.println("Not eligible to apply for govt jobs");
				}
			}
			else
			{
				System.out.println("valid age for marraige");
			}
		}
		else
		{
			System.out.println("not a legal voter");
		}
}
}
