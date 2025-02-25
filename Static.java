public class Static{
    //void method
public static void s()
    {
        System.out.println("Hello i am static method");
    }
        //non-static method
void f()
    {
        System.out.println("Hello i am non-static method" );
    }
    
public static void main(String[] args) {
        s();
        Static g = new Static();
           g.f();

    }
}