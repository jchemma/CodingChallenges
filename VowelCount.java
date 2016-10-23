
import java.util.Scanner;

public class VowelCount{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Word: ");
        String input = sc.next();
        int a=0,e=0,i=0,o=0,u=0;
        for(char character: input.toCharArray()){
            switch(character){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    continue;
            }
        }
        System.out.println(
                  "a: "+a+"\n"
                + "e: "+e+"\n"
                + "i: "+i+"\n"
                + "o: "+o+"\n"
                + "u: "+u+"\n"
                + "Total vowels: "+(a+e+i+o+u));
    }
}