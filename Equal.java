//java program to find all pairs of elements in an array whose sum is equal to a (target) specified number
import java.util.*;
class Equal
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("entre the size of array");
 int n=sc.nextInt();// reading the length of array
 System.out.println("entre the array elements");
 int a[]=new int[n];//reading array elements
 for(int i=0;i<n;i++)
 {
  a[i]=sc.nextInt();
 }
 System.out.println("entre the target");
  int t=sc.nextInt();//reading target
 checkSum(n,a,t);// method calling
 }
 public static void checkSum(int n,int a[],int t)
 {
 for(int i=0;i<n;i++)// loop for 1st array element
 {
  for(int j=i+1;j<n;j++)// loop for 2nd elements
  {
   if(a[i]+a[j]==t)// condintion for comparing the array elements and target value
   {
   System.out.println(" by adding array values we got the target value"+i+","+j);
    }
   }
  }
 }
}