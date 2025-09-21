import java.util.*;
public class arrays {
    public static void main(String[] args){
        String[] fruits = new String[8];
        fruits[0] = "pineapple";
        fruits[1] = "apple";
        fruits[2] = "banana";
        fruits[3] = "guava";
        fruits[4] = "orange";
        fruits[5] = "grapes";
        fruits[6] = "mango";
        fruits[7] = "kiwi";

        for(int i =0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println();
        Arrays.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
