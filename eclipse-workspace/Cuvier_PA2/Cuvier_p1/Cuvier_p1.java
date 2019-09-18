package Cuvier_p1;

import java.util.Scanner;
public class Cuvier_p1 {
	
public static void main(String[] args) {


int num1, num2,num3,num4,temp;

Scanner Scnr = new Scanner(System.in);
System.out.println("Enter All 4 Numbers we would like to cypher one by one :");

num1=Scnr.nextInt();
num2=Scnr.nextInt();
num3=Scnr.nextInt();
num4=Scnr.nextInt();

num1=(num1)%10;
num2=(num2)%10;
num3=(num3)%10;
num4=(num4)%10;



num1=(num1+7)%10;
num2=(num2+7)%10;
num3=(num3+7)%10;
num4=(num4+7)%10;

temp=num1;
num1=num3;
num3=temp;

temp=num2;
num2=num4;
num4=temp;

System.out.println("Encrypted Data is :"+num1+num2+num3+num4);

return ;
	}
}

	

