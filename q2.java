import java.util.Scanner;

public class q2 {
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

        int max = arr[0];
        for(int i=1; i<s; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
