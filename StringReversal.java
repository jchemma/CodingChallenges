
import java.util.Scanner;

public class StringReversal{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What string would you like to reverse?");
        String stringToReverse = sc.next();
        for(int i=0;i<stringToReverse.length();i++){
            System.out.print(stringToReverse.substring(stringToReverse.length()-1-i,stringToReverse.length()-i));
        }
        System.out.println();
    }
}