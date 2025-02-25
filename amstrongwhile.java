class amstrongwhile{
   public static void main(String[]margs){
      int num,number,temp,total=0;
      num=153;
      number=num;
     while(number!=0){
        temp = number%10;
        total = total+temp*temp*temp;
        number = number/10;
      }
     
      if(num==total){
        System.out.println("the number is Amstrong");
      }else{
        System.out.println("The number is not Amstrong");
      }
    }
}



    

