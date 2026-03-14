import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        String str = s.nextLine();

        System.out.println(x);
        System.out.println(str);
        s.close();
    }
}
