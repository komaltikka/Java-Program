class Union
{
 public static void main(String[] args){
  int[] a1={1,3,5,7,10};
  int[] a2={2,3,7,8,10};
  int m=a1.length;
  int n=a2.length;
  int i=0,j=0;
 System.out.println("Union of two arrays is:");
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
                System.out.print(a2[j]+" ");
                j++;
            }
    }
}