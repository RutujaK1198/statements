package statements;

public class Switchstatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//cw-cash withdrawl, ms=mini statement, bc=balance check, pc=pin change, ft=fund transfer
		String input="cw";
		switch (input)
		{
		case "cw":
			System.out.println("Cash withdrawl");
			break;
		case "ms":
			System.out.println("Mini statement");
			break;
		case "bc":
			System.out.println("balance check");
			break;
		case "ft":
			System.out.println("Fund transfer");
			break;
		case "mb":
			System.out.println("mobile banking");
			break;
		case "pc":
		System.out.println("Pin change");
		    break;
		default:
			System.out.println("Invalid input");
			break;
			
		}
	}

}
