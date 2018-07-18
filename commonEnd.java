class commonEnd{
public static void main(String args[]){

 int[] a={1,2,2};
 int[] b={7,2};
 boolean res=commonEnd(a,b);
 System.out.println(res);
}
 public static boolean commonEnd(int[] a,int[] b){
 boolean first=a[0]==b[0]; 
 boolean last=a[a.length-1] == b[b.length-1];
 boolean result=first || last;
 return result;
}
}