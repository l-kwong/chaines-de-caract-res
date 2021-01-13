/*
* Author : laurenkwong
*Date : 8-Jan-2021
*/
public class problemeJ2
	{

		public static void main(String[] args)
			{
		        String a = "+++===!!!!:-)):-())=";
		        int joyeuse = 0, triste = 0;
		        
		        char [] ab=a.toCharArray();
		        for (int i = 0; i < ab.length; i++)
		        {  
		        	if(ab[i]==':'&& ab[i+1]=='-')
		        		if(ab[i+2]==')')
		        			joyeuse++;
		        		else if(ab[i+2]=='(')
		                    triste++;
		        }
		        	if (joyeuse == 0 && triste == 0)
		        		{
		        			System.out.println("aucune");
		        		} 	
		        	else if (joyeuse == triste)
		        		{
		            		System.out.println("incertaine");
		        		} 	
		        	else 
		        		{
		            		System.out.println((joyeuse > triste)? "joyeuse" : "triste");
		        		}
		    }
		}