import java.util.Scanner;

/*
* Author : laurenkwong
*Date : 8-Jan-2021
*/
public class problemeJ2
	{

		public static void main(String[] args)
			{
		        Scanner in = new Scanner(System.in);
		        String characters = in.nextLine();

		        int happy = 0;
		        int sad = 0;

		        for (int i = 0; i < characters.length(); i++)
		        {  happy++;
		                
		           			{
		                        sad++;
		                    }
		                
		            }
		        }
		        if (happy == 0 & sad == 0){
		            System.out.println("none");
		        } else if (happy == sad){
		            System.out.println("unsure");
		        } else {
		            System.out.println((happy > sad)? "happy": "sad");
		        }
		    }
		}