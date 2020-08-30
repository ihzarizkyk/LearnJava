/*
Author : Mochammad Ihza Rizky Karim
filename : operator.java
*/

public class operator{

	public static void main(String[] args)
	{
		int a,b,c,d,hasil;
		int nilai1 = 11;
		int nilai2 = 4;
		boolean hasilnya;
		boolean  tanya = true;
		String jawab;

		a = 10;
		b = 3;
		c = 20;
		d = 3;

		// Operator Aritmatika

		hasil = a+b;
		System.out.println("Hasil dari a + b = " + hasil);
		hasil = a-b;
		System.out.println("Hasil dari a - b = " + hasil);
		hasil = a/b;
		System.out.println("Hasil dari a / b = " + hasil);
		hasil = a*b;
		System.out.println("Hasil dari a * b = " + hasil);
		hasil = a%b;
		System.out.println("Hasil dari a % b = " + hasil);

		// Operator Penugasan
		hasil = c+=d;
		System.out.println("Hasil Penjumlahan " + hasil);
		hasil = c-=d;
		System.out.println("Hasil Pengurangan " + hasil);
		hasil = c/=d;
		System.out.println("Hasil Pembagian" + hasil);
		hasil = c*=d;
		System.out.println("Hasil Perkalian " + hasil);
		hasil = c%=d;
		System.out.println("Hasil Modulus " + hasil);

		// Operator Perbandingan
		hasilnya = nilai1>nilai2;
		System.out.println("Apakah nilai1 lebih besar dari nilai2? " + hasilnya);
		hasilnya = nilai1<nilai2;
		System.out.println("Apakah nilai1 lebih kecil dari nilai2? " + hasilnya);
		hasilnya = nilai1>=nilai2;
		System.out.println("Apakah nilai1 lebih besar sama dengan  nilai2? " + hasilnya);
		hasilnya = nilai1<=nilai2;
		System.out.println("Apakah nilai1 kurang dari sama dengan  nilai2? " + hasilnya);
		hasilnya = nilai1==nilai2;
		System.out.println("Apakah nilai1 sama dengan  nilai2? " + hasilnya);
		hasilnya = nilai1!=nilai2;
		System.out.println("Apakah nilai1 tidak sama dengan  nilai2? " + hasilnya);

		// Operator Ternary
		jawab = tanya ? "iya" : "tidak";
		System.out.println(jawab);
		// ? = if(tanya)
		// true = iya
		// false = tidak
	}
}
