import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = 0;
        if(sc.hasNextInt()){
            s = sc.nextInt();
        }
        int[] arr = new int[s];
        int sr = 0;
        if(sc.hasNextInt()){
            sr = sc.nextInt();
        }

        int bool = 0;
        for(int i=0; i<s; i++){
            if(sc.hasNextInt())
                arr[i] = sc.nextInt();

            if(sr == arr[i])
                bool = 1;
        }
        if(bool == 1){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

    }
}
