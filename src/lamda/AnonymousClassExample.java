package lamda;

public class AnonymousClassExample {
    //static void printMethodCall(Printable printable){
//        printable.print();
//
   // }
    public static void main(String[] args) {


       Printable p = new Printable() {


           @Override
           public String print() {
               return "print method called";
           }
       };

        System.out.println(p.print());


    }
}
