import java.util.Scanner;
public class vote{
public static void main(String args[]){
int age,shrt;
Scanner scan=new Scanner(System.in);
System.out.println("enter age:");
age=scan.nextInt();
if(age>=18){
System.out.println("welcome to vote");}
else{
shrt=(18-age);
System.out.println("sorry,you can vote after:"+shrt+"years");}
}}
