package lamda;

public class LamdaExample {
    public static void main(String[] args) {
        Printable p = ()-> "This is the implementation of functional interface";
        System.out.println( p.print());
    }
}
