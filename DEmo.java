class Demo{
public static void main(String args[]){
int[] arr={1,2,3,9};
Demo d=new Demo();
boolean result=d.isEveryWhere(arr,1);
System.out.println(result);
}

public  boolean isEveryWhere(int[] arr,int element){
for(int i=0;i<arr.length-1;i++){
 int e1=arr[i];
 int e2=arr[i+1];
if( e1==element || e2==element){}
else{
 return false;
}
}
return true;
}
}