import java.util.Scanner;

/*
* Author : laurenkwong
*Date : 10-Jan-2021
*/
public class problemeJ3
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				String code;
				
				System.out.println("Insérez le code?");
				code=sc.toString();

				String Symbole= code;
				for (int i = Symbole.length()-1; i>=0; i--) 
				{
					System.out.println(Symbole.charAt(i));
				}
				
				int a[]= {2,4,7,8};
				System.out.println(a);
			}

	}
