import java.util.Scanner;

/*
* Author : laurenkwong
*Date : 10-Jan-2021
*/
public class problemeJ3
	{

		public static void main(String[] args)
			{
		        String a = "+++++++---AAAAAAAAAXXX";
		        int plus = 0, moin = 0, A=0, X=0;
		        
		        char [] ab=a.toCharArray();
		        for (int i = 0; i < ab.length; i++)
		        {  
		        	if(ab[i+1]=='+')
		        		plus++;
		        	else if(ab[i+1]=='-')
		                moin++;
		        	else if(ab[i+1]=='A')
		                A++;
		       		else if(ab[i+1]=='X')
		                X++;
		        	
		        System.out.println(plus);
		        
		        }
		        
		       
			}
		}
