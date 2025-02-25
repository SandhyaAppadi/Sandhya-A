import java.util.*;
public class Arithmeticoperators {
    public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    int a = Sc.nextInt();
    int b = Sc.nextInt();
    int sum;
    int sub;
    int add;
    sum = a+b;
    sub = a-b;
    System.out.println("sum" + sum);
    System.out.println("sub" + sub);
    add = sum + sub;
    System.out.println("add" + add);
    }
}