package methodeRefrence;

public class TaskImpl {
    public static void main(String[] args) {

        //static methode refrence ClassName::methodeName
        Task task = DoingTask::doTask;
        task.doStuff();  //so here we refer the doTask() method to doStuff() and the body of doTask is refer to dostuff
    }
}
