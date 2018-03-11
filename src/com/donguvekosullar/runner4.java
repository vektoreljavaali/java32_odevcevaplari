package com.donguvekosullar;

import java.util.Scanner;

public class runner4 {

	public static int x=2,y=3;
	public static void main(String[] args) {
		// þekildeki soru
		//
		// . . . .
		// . . . .
		// . . * .
		// . . . .
		// 
		// 1- yukarý 
		// 2- sola 
		// 3- saða
		// 4- aþaðýya
		
		int konum = 11;
		
		System.out.println("***********************");
		System.out.println("****** YÖN SEÇÝNÝZ ****");
		System.out.println("***********************");
		System.out.println();
		konum = x*4+y;
		ekranabas(konum);
		System.out.println();
		System.out.println("1- Yukarý");
		System.out.println("2- Sola");
		System.out.println("3- Saða");
		System.out.println("4- Aþaðýya");
		System.out.println("5- Çýkýþ");
		
		Scanner sc = new Scanner(System.in);
		int yon=0;
		do {
		yon = sc.nextInt();
		ilerle(yon);
		konum = x*4+y;
		ekranabas(konum);
		System.out.println("Yön Seçiniz....");
		}while(yon<5);
		
		
		System.out.println("Program sonlandýrýldý");	
	}
	
	public static void ilerle(int yon) {
		
		if(yon==1)
			if(x==0) 
				x=3;
			else
				x--;		
		else if(yon==2)
			if(y==1)
				y=4;
			else
				y--;
		else if(yon==3)
			if(y==4)
				y=1;
			else
				y++;
		else
			if(x==3)
				x=0;
			else
				x++;		
	} 
	
	public static void ekranabas(int konum) {
		for (int i = 0; i <4 ; i++) {
			for (int j = 1; j <=4 ; j++) {
				if((i*4+j)==konum)
					System.out.print(" *");
				else
					System.out.print(" .");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
}
