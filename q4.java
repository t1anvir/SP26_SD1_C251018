import java.util.Scanner;
public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = 0;
        if(sc.hasNextInt()){
            s = sc.nextInt();
        }

        int sum = 0;
        int[] arr = new int[s];
        for(int i=0; i<s; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
        }
        double avg = (double) sum/(double) s;

        System.out.println(avg);
    }
}
