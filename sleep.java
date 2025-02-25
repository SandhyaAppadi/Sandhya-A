class sleep {
   public static void main(String[] args) {
        try{
         while(true){
          System.out.println("Hi");
          Thread.sleep(5000);
          System.out.println("Hello");
          Thread.sleep(5000);
          System.out.println("Goodmorning");
          Thread.sleep(5000);
         }
        }
        catch(InterruptedException e)
        {
            
        }
    }
}