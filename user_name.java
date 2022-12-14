import java.util.Scanner;
class user_name{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String str1=in.nextLine();
System.out.println("re enter username");
String str2=in.nextLine();
if(str1.equals(str2)){
System.out.println("username is valid");}
else{
System.out.println("username is not valid");}
}
}