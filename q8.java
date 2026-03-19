import java.util.Scanner;

public class q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        String ln = sc.nextLine();
        int sz = ln.length();

        int bool = 1;

        for(int i=0; i<sz/2; i++){
            if(ln.charAt(i) != ln.charAt(sz-1-i)){
                bool = 0;
                break;
            }
        }

        if(bool == 1) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");

        sc.close();
    }
}
