import java.util.Scanner;

public class q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        int sz = ln.length();

        int con = 0, vol = 0;

        for(int i=0; i<sz; i++){
            if(ln.charAt(i) == 'a' || ln.charAt(i) == 'e'|| ln.charAt(i) == 'i' || ln.charAt(i) == 'o'|| ln.charAt(i) == 'u') {
                vol++;
            }
            else if(ln.charAt(i) == ' '){
                continue;
            }else {
                con++;
            }
        }

        System.out.println("Vowels:" + vol);
        System.out.println("Consonants:" + con);

        sc.close();
    }
}
