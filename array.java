// Aurthor: Saakshi.....trying to make life easy by using arrays
import java.util.Scanner;


class array
{
	// Method main
	public static void main (String[] Param)
       {
	 	String[] movies = new String[5];
		int[] profit = new int[5];

		int sum=0;
		for(int i=0; i<=4; i++)
		{
			movies[i]= input("Enter Flim :");
		        String d=input("How much did "+ movies[i] + " take in millions of pounds?");
			profit[i]= Integer.parseInt(d);
			sum+=profit[i];
			
		}
		
		printresult(movies, profit);
		print("Together these 5 movies took "+ sum+" million pounds at the box office");
		return;
	}

	//method that takes 2 arrays as arguments
	public static void printresult(String[] movie, int[] profits)
	{

			print("The flims and the amount they made are :");
			for(int k=0; k<=4; k++)
			{
				print(movie[k] + " , "+ profits[k]);
			}
		
	}

	//method to print
	public static void print( String s)
	{
		System.out.println("\n"+s+"\n");
	}

	//method to accept and return input
	public static String input(String p)
	{
		Scanner scanner = new Scanner(System.in);
		print(p);
		String a= scanner.nextLine();
		return a;
	}
}//end of class array
 
	
