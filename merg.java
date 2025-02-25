import java.util.*;
class merg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int arr1[]= new int[a];
       int arr2[]= new int[b];
       int arr[] = new int[a+b];
       for( int i=0;i<a;i++)
       arr1 [i] = sc.nextInt();
       for (int i = 0; i<b; i++)
       arr2 [i] = sc.nextInt();
       int p =0;
       for (int i=0;i<a;i++) {
        arr [p] = arr1[i] ;
        p++;
       }
       for (int i =0; i<b; i++){
        arr [p] = arr2[i] ;
        p++;
       }
          System.out.println(Arrays.toString(arr));
       

    }
}