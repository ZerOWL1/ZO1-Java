
import controller.TaskControl;
import entity.Task;
import static java.time.Instant.now;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import validate.Validation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryuu
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        ArrayList<Task> listTask = new ArrayList<>();
        TaskControl taskC = new TaskControl();
        int choice;
        
        while (true) {
            choice = TaskControl.menuChoice();
            switch (choice) {
                case 1:
                    listTask = taskC.addTask(listTask);
                    break;
                case 2:
                    listTask = taskC.updateTask(listTask);
                    break;
                case 3:
                    taskC.deleteTask(listTask);
                    break;
                case 4:
                    taskC.getDataTasks(listTask, "MMM-dd-yyyy");
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("EXIT...");
                    return;
            }
        }
    }

}
