import java.util.*;

//4. Given an array of integers and a target sum, return the indices of the two numbers that add up to the target

public class Task4 {
    public static void main(String[] args) {

        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the element of array one-by-one : ");
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        System.out.print("Enter the target integer : ");
        int target = sc.nextInt();

        List<Integer> result = problem(arr, target);

        System.out.println("the indices are : " + result);


    }

    public static List<Integer> problem(List<Integer> nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.size();

        for(int i = 0; i < n; i++){
            int carry = target - nums.get(i);

            if(mp.containsKey(carry)){
                return Arrays.asList(mp.get(carry), i);
            }
            else{
                mp.put(nums.get(i), i);
            }
        }
        return null;
    }
}
