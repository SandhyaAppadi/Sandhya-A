class amstrongfor{
   public static void main(String[]margs){
      int num,number,temp,total=0,n=0;
      num=153;
      number=num;
      for(;number!=0;number/=10)
      {
        temp = number%10;
        total = total+temp*temp*temp;
      }
      if(num==total){
        System.out.println("The number is Amstrong");
      }else{
        System.out.println("The number is not Amstrong");
      }
    }
}



    

