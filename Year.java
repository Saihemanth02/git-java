import java.util.Scanner;
public class Year{
    public static void main(String args[])
    {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        year=sc.nextInt();
        if(((year%4==4)&&(year%100!=0))||(year%400==0))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    } 
}
