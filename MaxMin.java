class MaxMin{
 public static void main(String args[])
  {
    int i,max=0;
    int[] a={20,30,80,10,100};
    int  min=0;
   for( i=0;i<a.length;i++)
   {
     if(a[i]>max)
     {
        max=a[i];
     }
   else{
       min=a[i];
    }
 }
System.out.println("Maximum Element is:"+max);
System.out.println("Minimum Element is:"+min);
}
}