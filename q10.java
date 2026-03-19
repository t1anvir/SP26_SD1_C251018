import java.util.Scanner;

public class q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ln = sc.nextLine();
        int sz = ln.length();
        String res = "";

        for(int i=0; i<sz; i++){
            if(ln.charAt(i) >= 65 && ln.charAt(i) <= 90){
                res += Character.toLowerCase(ln.charAt(i));
            }else{
                res += Character.toUpperCase(ln.charAt(i));
            }
        }

        System.out.println(res);
    }
}
