class SumAvg
{
 public static void main(String args[])
  {
   int[]  arr={1,2,3,4};
   int sum=0;
   float  avg;
  for(int i=0;i<arr.length;i++)
  {
   sum=sum+arr[i];
 
   }
System.out.println("Sum is:"+sum);
avg=(float)sum/arr.length;
System.out.println("Average is:"+avg);
}  
}