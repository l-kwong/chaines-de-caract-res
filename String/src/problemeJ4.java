/*
* Author : laurenkwong
*Date : 10-Jan-2021
*/
public class problemeJ4
	{

		public static void main(String[] args)
			{
				String a = "5" + "CC..C" + ".CC..";
				int occupee = 0, vide = 0;
	        
	        char [] ab=a.toCharArray();
	        for (int i = 0; i < ab.length; i++)
	        {  
	        	if(ab[i+1]=='C')
	        			occupee++;
	        		else if(ab[i+1]=='.')
	                    vide++;
	        }
	        
	        System.out.println(occupee);
				
				
			}

	}
