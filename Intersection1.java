class Intersection1
 {
  public static void main(String[] args){
  int[] a={1,3,5,7,10};
  int[] b={2,3,7,8,10};
  int m=a.length;
  int n=b.length;
  int i=0,j=0;
   
   while(i<m &&j<n)
   {
       if(a[i]<b[j])
        i++;
      else if(b[j]<a[i])
        j++;
      else
       {
          System.out.println(b[j++]+" ");
          i++;
       }
   }
}
}

