import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s =0;
        if(sc.hasNextInt()){
            s = sc.nextInt();
        }
        int[] arr = new int[s];
        int ev = 0, od = 0;

        for(int i=0; i<s; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }

            if(arr[i]%2 == 0)
                ev++;
            else
                od++;
        }
        System.out.println("Even= " + ev );
        System.out.println("Odd= " + od );
    }
}
