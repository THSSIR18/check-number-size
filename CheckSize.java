import java.util.Scanner;
public class CheckSize
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int aNum= sc.nextInt();
		if (aNum > 99)
			System.out.println("The number has more than two digits");
		else
			System.out.println("The number has less than two digits");
	}
}