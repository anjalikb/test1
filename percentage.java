import java.util.*;
class percentage
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks:");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int m4=sc.nextInt();
int m5=sc.nextInt();
int total=m1+m2+m3+m4+m5;
int p=100*(total/500);
if(p>=60)
{
System.out.println("Division 1");
}

 else if (p>=50 && p<=59)

{
System.out.println("Division 2");
}

 else if (p>=40 && p<=49)

{
System.out.println("Division 3");
}
 else if (p>=40) 

{
System.out.println("Fail");
}


}
}
