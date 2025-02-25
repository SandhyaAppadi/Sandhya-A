import java.util.*;
public class sumres{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    String res = String.format("sum of a and b value of a is: %d \n vallue of b is: %d", a,b);
    System.out.println(res);
}
}