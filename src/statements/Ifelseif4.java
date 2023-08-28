package statements;

import java.util.Scanner;

public class Ifelseif4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks;
System.out.println("Enter your marks");
Scanner obj= new Scanner(System.in);
marks= obj.nextInt();

if(marks>=60 && marks<=100)
	{
	System.out.println("Congratulation you are passed with First class");
    }
else if(marks>=45 && marks<60)
{
	System.out.println("You are pass with Second class");
}
else if(marks>=33 && marks<45)
{
	System.out.println("You are pass with Third class");
}
else
{
	System.out.println("Sorry, you are failed");
}
	}

}
