package Cuvier_p1;

import java.util.Scanner;

public class Cuvier_p1decryption {

public static void main(String[] args) {
	int num1, num2,num3,num4,temp;
	
	Scanner Scnr = new Scanner(System.in);
	System.out.println("Enter All 4 Numbers we would like to decypher one by one :");
	num1=Scnr.nextInt();
	num2=Scnr.nextInt();
	num3=Scnr.nextInt();
	num4=Scnr.nextInt();
	

	
	num1=(num1)-7;
	if (num1<0)
		num1+=10;
	
	num2=(num2)-7;
	if (num2<0)
		num2+=10;
	
	num3=(num3)-7;
	
	if (num3<0)
		num3+=10;
	
	num4=(num4)-7;
	if (num4<0)
		num4+=10;
	
	
	temp=num1;
	num1=num3;
	num3=temp;

	temp=num2;
	num2=num4;
	num4=temp;
	
	


	System.out.println("Decrypted Data is :"+num1+num2+num3+num4);
	
}

}
