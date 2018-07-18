class OddPrime{
  public static boolean isPrime(int number)
   {
     for(int i=2;i<(number/2)+1;i++)
     {
       if((number%i==0)&&(number%2==0))
       {
         return false;
        
       }
    }
  return true;
}  
  public static void main(String args[])
  {
   int[] numbers={2,3,5,7,9,4,6,8};
  for(int number:numbers)
  {
       System.out.println( +number+ " "+"IsPrime:"+isPrime(number));
  }
}
}
