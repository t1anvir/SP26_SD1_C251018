import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = 0;
        if(sc.hasNextInt()){
            s = sc.nextInt();
        }

        int[] arr = new int[s];

        for(int i=0; i<s; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }
        }

        int min = arr[0];
        for(int i=0; i<s; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
