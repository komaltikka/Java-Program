class Intersection
 {
   public static void intersection(int[] ,int[] ,int ,int )
   {
    int i=0,j=0;
   int m,n;
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
public static void main(String[] args){
  int[] a={1,3,5,7};
  int[] b={2,3,7,8};
  int m=a.length;
  int n=b.length;
 intersection(a,b,m,n);
}

}