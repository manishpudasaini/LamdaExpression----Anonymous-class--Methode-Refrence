package methodeRefrence;

import java.time.LocalDateTime;

public class DoingTask {
    public static void doTask(){
        System.out.println("Completing the given task!!!");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current time = "+dateTime.toString());
    }
}
