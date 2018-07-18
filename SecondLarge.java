class SecondLarge{
public static int secondlarge(int[] a,int total){
 int temp;
for(int i=0;i<total;i++){
for(int j=i+1;j<total;j++){
 if(a[i]>a[j]){
  temp=a[i];
  a[i]=a[j];
  a[j]=temp;
}
}
}

return a[total-2];
}

public static int minElement(int[] a){
    int i;
    int  min=a[0];
   for( i=0;i<a.length;i++)
   {
     if(min>a[i])
     {
        min=a[i];
     }

  }
   return min;
}
public static void main(String[] args)
{
  int[] a={8,2,56,1};
  System.out.println("Second largest element is:"+secondlarge(a,4));
  System.out.println("Minimum element is:"+minElement(a));
}
}