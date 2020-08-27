/*
@Author : Mochammad Ihza Rizky Karim
Program Name : casting.java
*/

// Casting Data Types
// Konversi Tipe Data

public class casting{

	public static void main(String[] args)
	{
		// Widening Casting
		int Angka = 9;
		double Dobel = Angka;

		// Narrowing Casting
		int Number = 10;
		double Numbers = (double) Number;

		System.out.println(Angka); 
		System.out.println(Dobel);
		System.out.println(Number);
		System.out.println(Numbers);
	}
}

/*
OUTPUT :

9
9.0
10
10.0

*/
