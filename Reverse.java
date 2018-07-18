
class Reverse{

public  int[] reverse(int[] a){
int j=0,i;
int[] b=new int[a.length];
for( i=a.length-1;i>=0;i--)
 {
 b[j++]=a[i];
 }
return b;
 }
 public static void main(String args[]){
 Reverse r=new Reverse();
 int[] a={1,3,2,10};
 int[] b=r.reverse(a);
 System.out.println("Reverse array is:"+b);
}


}
