
import java.util.*;

public class power{
    public static void main(String args[]){
        int num1,num2,num3,num4;
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       num1 = a^2;
       num2 = b^4;
       num3 = a^1;
       num4 = num1+num2+num3;
       System.out.println(num4);
    }
}