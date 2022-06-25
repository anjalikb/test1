import java.util.*;
 class vowel
{
  public static void main(String args[])
 {
   char a=0;
   Scanner sc=new Scanner(System.in);
   char ch=sc.next().charAt(0);
   
   System.out.println("enter the character" + ch);
  
    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
   {
     System.out.println( ch + " = this is vowel character");
    }
   else 
   {
    System.out.println( ch + " = this is not vowel character");
    }
  }
}
