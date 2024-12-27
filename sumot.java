import java.util.Scanner;
public class sumot
       {
	 public static void main(String args[])
	{
	int a,b,c,sum;
	float avg;
	Scanner sai =new Scanner(System.in);
	a=sai.nextInt();
	System.out.println("The First Number is:" + a);
	b=sai.nextInt ();
	System.out.println("The Second Number is:" + b);
	c=sai.nextInt();
	System.out.println("The Third Number is:"+ c);
	sum=a+b+c;
	System.out.println("The sum is:" + sum);
	avg=(float)sum/3;
	System.out.println("The Average is:" + avg);
	}	
    }	