import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        if(sc.hasNextInt()){
            size = sc.nextInt();
        }

        int [] arr = new int[size];

        for(int i=0; i<size; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
