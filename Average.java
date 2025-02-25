
import java.util.Scanner;

public class Average{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        String S = Sc.next();
        int s1 = Sc.nextInt();
        int s2 = Sc.nextInt();
        int avg = (s1+s2)/2;
        System.out.println(S+ "your avg is:" + avg);
    }
}