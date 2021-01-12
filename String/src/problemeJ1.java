import java.util.Scanner;

/*
* Author : laurenkwong
*Date : 8-Jan-2021
*/
public class problemeJ1
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int ananas3=0, ananas2=0, ananas1=0, bananes3=0, bananes2=0, bananes1=0;
				
				System.out.println("Combien des tirs à 3 points pour les ananas?");
					ananas3=sc.nextInt();
				System.out.println("Combien des tirs à 2 points pour les ananas?");
					ananas2=sc.nextInt();
				System.out.println("Combien des tirs à 1 points pour les ananas?");
					ananas1=sc.nextInt();
				System.out.println("Combien des tirs à 3 points pour les bananes?");
					bananes3=sc.nextInt();
				System.out.println("Combien des tirs à 2 points pour les bananes?");
					bananes2=sc.nextInt();
				System.out.println("Combien des tirs à 1 points pour les bananes?");
					bananes1=sc.nextInt();

				int produit=problemeJ1.multiplication(ananas3, 3);
				int produit1=problemeJ1.multiplication1(ananas2, 2);
				int produit2=problemeJ1.multiplication2(ananas1, 1);
				int produit3=problemeJ1.multiplication3(bananes3, 3);
				int produit4=problemeJ1.multiplication4(bananes2, 2);
				int produit5=problemeJ1.multiplication5(bananes1, 1);
				
				int somme=Math.addExact(produit, produit1);
				int ananas=Math.addExact(somme, produit2);
				int somme1=Math.addExact(produit3, produit4);
				int bananes=Math.addExact(somme1, produit5);
				
				if (ananas>bananes)
					{
						System.out.println("A");
					}
				else if (ananas<bananes)
					{
						System.out.println("B");
					}
				else 
						System.out.println("T");
					
				
			}
		
		public static int multiplication(int ananas3, int b)
			{
				return ananas3*b;
			}
		public static int multiplication1(int ananas2, int b)
			{
				return ananas2*b;
			}
		public static int multiplication2(int ananas1, int b)
			{
				return ananas1*b;
			}
		public static int multiplication3(int bananes3, int b)
			{
				return bananes3*b;
			}
		public static int multiplication4(int bananes2, int b)
			{
				return bananes2*b;
			}
		public static int multiplication5(int bananes1, int b)
			{
				return bananes1*b;
			}
		
		
	}