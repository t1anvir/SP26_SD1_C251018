import java.util.Scanner;

public class q7 {
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
        for(int i=0; i<s-1; i++){
            for(int j = 0; j<s-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<s; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
