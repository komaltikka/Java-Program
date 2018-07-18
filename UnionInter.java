class UnionInter
{
 public static void main(String[] args){
  int[] a1={1,3,5,7,10};
  int[] a2={2,3,7,8};
  int m=a1.length;
  int n=a2.length;
 union(a1,a2,m,n);
 intersection(a1,a2,m,n);
}
public static int union(int[] a1,int[] a2,int m,int n)
{
  int i=0,j=0;
System.out.print("union of 2 arrays is:");
 while(i<m&&j<n)
        {
            if(a1[i]<a2[j])
            {
                System.out.print(a1[i]+" ");
                i++;
            }
            else
                if(a2[j]<a1[i])
                {
                    System.out.print(a2[j]+" ");
                    j++;
                }
                else
                {
                    System.out.print(a1[i]+" ");
                    i++;
                    j++;
                }
        }
  while(i<m)
            {
                System.out.print(a1[i]+" ");
                i++;
            }
        
        
            while(j<n)
            {
                System.out.println(a2[j]+" ");
                j++;
            }
 return 0;
}       
 public static int intersection(int[] a1,int[] a2,int m,int n) {
int i=0,j=0;
   System.out.print("Intersection of 2 arrays is:");
   while(i<m &&j<n)
   {
       if(a1[i]<a2[j])
        i++;
      else if(a2[j]<a1[i])
        j++;
      else
       {
          System.out.print(a2[j++]+" ");
          i++;
       }
   
   }
return 0;
}
}