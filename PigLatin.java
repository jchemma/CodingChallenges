
import java.util.Scanner;

public class PigLatin{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        for(String word: inputArray){
            word = word.trim().toLowerCase().replaceAll("[^\\w]", "");
            String reversedWord = word.substring(1)+"-"+word.substring(0,1)+"ay ";
            System.out.print(reversedWord);
        }
        System.out.println();
    }
}