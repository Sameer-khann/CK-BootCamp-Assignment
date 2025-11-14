
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface NumberRule{
    boolean apply(int n);
}

class Java8{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7);

        NumberRule isEven = (n) -> n % 2 == 0;
        NumberRule isPrime = n -> {
            if(n <= 1) return false;
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        };

        List<Integer> newLi = nums.stream().filter(n -> isEven.apply(n) && isPrime.apply(n)).map(n -> n * n).toList();

        System.out.println("List after stream : " +  newLi);

       Optional<Integer> newOptInt = newLi.stream().findFirst();

       if(newOptInt.isPresent()){
           System.out.println("First squared value from List is : " + newOptInt);
       }
       else {
           System.out.println("no number found.");
       }

    }
}