package com.donguvekosullar;

public class Runner2 {

	public static void main(String[] args) {

			//3 sayýyý büyükten küçüðe sýralayýnýz.
		int s1=34,s2=4,s3=55;
	
		if(s1>s2 && s1>s3) {
			if(s2>s3)
				System.out.println(s1+" - "+s2+" - "+s3);
			else
				System.out.println(s1+" - "+s3+" - "+s2);
		}
		else if(s2>s3) {
			if(s1>s3)
				System.out.println(s2+" - "+s1+" - "+s3);
			else
				System.out.println(s2+" - "+s3+" - "+s1);
		}else {
			if(s1>s2)
				System.out.println(s3+" - "+s1+" - "+s2);
			else
				System.out.println(s3+" - "+s2+" - "+s1);
		}
			
	


	}

}
