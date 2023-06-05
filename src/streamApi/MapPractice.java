package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class MapPractice {
    public static void main(String[] args) {
        List<Integer> num = List.of(2,3,5,6,7,8);

        /*
        * here we first find the square of every number.
        * Map is used for that because we can perform operation on each element
        * Map always return elements so we use map
        * filter is used to filter the number which are even only & collect that in one seperate list
         */
       List<Integer> evenNumberSquare =  num.stream().map(i -> i*i).filter(e -> e%2==0).collect(Collectors.toList());
        System.out.println(evenNumberSquare);




    }
}
