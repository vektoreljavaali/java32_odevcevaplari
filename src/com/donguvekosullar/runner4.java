package com.donguvekosullar;

import java.util.Scanner;

public class runner4 {

	public static int x=2,y=3;
	public static void main(String[] args) {
		// �ekildeki soru
		//
		// . . . .
		// . . . .
		// . . * .
		// . . . .
		// 
		// 1- yukar� 
		// 2- sola 
		// 3- sa�a
		// 4- a�a��ya
		
		int konum = 11;
		
		System.out.println("***********************");
		System.out.println("****** Y�N SE��N�Z ****");
		System.out.println("***********************");
		System.out.println();
		konum = x*4+y;
		ekranabas(konum);
		System.out.println();
		System.out.println("1- Yukar�");
		System.out.println("2- Sola");
		System.out.println("3- Sa�a");
		System.out.println("4- A�a��ya");
		System.out.println("5- ��k��");
		
		Scanner sc = new Scanner(System.in);
		int yon=0;
		do {
		yon = sc.nextInt();
		ilerle(yon);
		konum = x*4+y;
		ekranabas(konum);
		System.out.println("Y�n Se�iniz....");
		}while(yon<5);
		
		
		System.out.println("Program sonland�r�ld�");	
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
