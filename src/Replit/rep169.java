package Replit;

public class rep169 {

    public static void main(String[] args) {

    }

    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        if(notEmpty) {
            if(taskId == currentId +1) {
                return true;
            } else return false;
        }

        else {
            return false;
        }
    }
}
