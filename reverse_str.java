import java.util.Scanner;
public class reverse_str{
public static void main(String args[]){
String str;
char ch;
Scanner sc=new Scanner(System.in);
System.out.print("enter a string:");
str=sc.nextLine();
System.out.println("reverse of a string'"+str+"'is:");
for(int j=str.length();j>0;--j){
System.out.print(str.charAt(j-1));}
}
}