import java.util.Scanner;

/*
* Author : laurenkwong
*Date : 8-Jan-2021
*/
public class problemeJ2
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				boolean joyeuse=":-)" != null;
				boolean triste=":-(" != null;
				boolean sentiment;
				
				System.out.println("Comment est-ce que vous sentez aujourd'hui?");
					sentiment=sc.toString() != null;
				
				
					
					if (sentiment=joyeuse)
						{
							System.out.println("joyeuse");
						}
					else if (sentiment=triste) 
						{
							System.out.println("triste");
						}
				
				
			}
		
		static int nombrePremier(boolean joyeuse)
			{
				int cpt=0; 
				for(int sentiment=joyeuse; cpt++;)
				{
					if(sentiment==triste) 
						cpt++;
				}
				return cpt;
			}
		
		
	}
