import java.util.*;
public class userInputArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[size];

        System.out.println("Enter " + size + " words:");

        for(int i = 0; i < size; i++){
            words[i] = scanner.nextLine();
        }

        for(String word : words){
            System.out.println(word);
        }
    }
}
