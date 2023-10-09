import java.util.Arrays;
import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();

        int smallest = Math.min(a1, Math.min(a2, a3));
        int largest = Math.max(a3, Math.max(a2,a1));

        System.out.println(smallest);
        System.out.println(largest);

        int arr[]=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        
    }
    
}
