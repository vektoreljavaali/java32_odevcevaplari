package com.donguvekosullar;

public class runner3 {

	public static void main(String[] args) {
		// girilen sayýya göre içiboþ kare çizdirmek
		// * * * *
		// *     *
		// *     *
		// * * * *
		//
		
		int sayi=4;
		
		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= sayi; j++) {
				if(i==1 || i==sayi || j==1 || j==sayi)
				System.out.print(" *");
				else
				System.out.print("  ");					
			}			
			System.out.println();
		}
	}

}
