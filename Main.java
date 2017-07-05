import java.io.*;
import java.util.*;
public class 
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new inputStreamReader(System.in));
int year;
System.out.println("Enter the year");
year=br.readLine();
if((year%4==0) && (year%100!=0))
{
System.out.println("The year is leap year");
}
else if(year%400==0)
{
System.out.println("The year is leap year");
}
else
{
System.out.println("the year is not leap year");
}
}
}
