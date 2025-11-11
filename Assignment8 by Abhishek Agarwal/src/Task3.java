import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//3. Find the First Non-Repeating Character

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        str1 = str1.toLowerCase();

        Map<Character, Integer> mp = new HashMap<>();

        for(char ch : str1.toCharArray()){
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch) + 1);
            }
            else{
                mp.put(ch, 1);
            }
        }

        for(char ch : str1.toCharArray()){
            if(mp.get(ch) == 1){
                System.out.println("First non repeating character is : " + ch );
                sc.close();
                return;
            }
        }

        System.out.println("There is no non-repeating charaters exist.");
    }
}
