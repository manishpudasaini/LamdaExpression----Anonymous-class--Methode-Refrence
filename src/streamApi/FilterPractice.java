package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class FilterPractice {

    public static void main(String[] args) {
        /*
        *so filter always return the Boolean value - true or false
        * it will filter the value and we can collect that value accourding to our condtion
         */

        List<String > names = List.of("Manish","Ronaldo","Modric","Marcelo");

        List<String> nameStartWithM = names.stream().filter(e -> e.startsWith("M")).collect(Collectors.toList());

        List<String> nameStartWithMAndR = names.stream().filter(e -> e.startsWith("M") || e.startsWith("R")).collect(Collectors.toList());

        System.out.println("Names start with letter M = "+nameStartWithM);
        System.out.println("Names start with letter M & R = "+nameStartWithMAndR);


    }
}
