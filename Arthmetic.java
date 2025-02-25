import java.util.*;
public class Arthmetic{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum , sub , mul , div ,mod;
        sum = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        mod = a%b;
        System.out.println("sum"  + sum);
        System.out.println("sub" + sub);
        System.out.println("mul" + mul);
        System.out.println("div" + div);
        System.out.println("mod" + mod);
    }
}