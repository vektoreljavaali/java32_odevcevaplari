package com.donguvekosullar;

public class runner {

	public static void main(String[] args) {
		//for loop
		int toplam =0;
		for (int i = 10; i >= 1; i=i-5) {
			
			toplam+=i;
			
						
		}// for d�g�s�n�n sonu
		
		System.out.println("toplam sonucu...:"+toplam);

		//while 
		
		int dongu=1;
		
		while(dongu<=10) {
			System.out.println("ekrana yaz...: "+dongu);
			dongu+=2;
		}//while d�ng�s�n�n sonu
		
		//do ... while
		
		int sondongu=10;
		do {
			
			System.out.println(sondongu);
			sondongu--;
		}while(sondongu>=1);
	
		
		
		
		
		
	}// main metodunun sonu

}// s�n�f�n sonu
