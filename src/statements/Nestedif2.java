package statements;

public class Nestedif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String UN="Prashant";
String PWD="Prashant@123";
System.out.println("Enter username");
if (UN=="Prashant") // change UN like Prasant console will show username is incorrect
{
	System.out.println("Username is correct");
	if (PWD=="Prashant@123")// type wrong password it will show password is incorrect
	{
		System.out.println("Login to system is successfull");
	}
	else
	{
		System.out.println("Password is incorrect");
	}
}
else
{
	System.out.println("Username is incorrect");
}
	}

}
