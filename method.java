public class method{
    //void method

    void s()
    {
          System.out.println("Hello");
         //non-void method
    }
    String s1()
    {
        return "Hello";
    }
    public static void main(String [] args){
        method ob = new method();        
            ob.s();
            System.out.println(ob.s1());
        }
    }
        
