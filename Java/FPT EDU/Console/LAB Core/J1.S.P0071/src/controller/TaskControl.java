/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Task;
import impl.ITask;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import validate.Validation;

/**
 *
 * @author Ryuu
 */
public class TaskControl implements ITask {

    /**
     * TASK_PLAN_VALID
     *
     * @^ Start string regex or a line
     * @$ End a string regex or a line
     * @[0-9]{1,2} - user must enter from 0-9 with at least 1-2 char digits
     * @\\.5 User must enter '.' char and '5' after
     * @ | or
     */
    private static final String TASK_PLAN_VALID = "^[0-9]{1,2}\\.5|[0-9]{1,2}\\.0$";

    public static int menuChoice() {
        System.out.println("========= Task Program =========");
        System.out.println("1. Add Task");
        System.out.println("2. Update Task");
        System.out.println("3. Delete Task");
        System.out.println("4. Display Task");
        System.out.println("5. Exit");
        int userChoice = Validation.checkIntLimit("Enter your choice: ", 1, 5);
        return userChoice;
    }

    public Task inputTask(ArrayList<Task> listTask, int taskID) {
        Task task = new Task();
        try {
            String rName = Validation.checkInputString("Requirement Name: ",
                    "^[A-Za-z ]+$");
            String taskTypeName = Validation.checkInputTaskTypeID("Task Type: ");
            Date date = Validation.checkInputDate("Date: ", "MMM-dd-yyyy");
            
            double from;
            double to;
            //loop until user enter Task End Time > Task Start Time
            while (true) {
                from = Validation.checkInputPlan("From: ",
                    TASK_PLAN_VALID, 8.0, 17.5);
                to = Validation.checkInputPlan("To: ",
                        TASK_PLAN_VALID, 8.0, 17.5);
                if (to < from) {
                    System.err.println("Time Start Task > Time End Task");
                } else {
                    break;
                }
            }

            String assign = Validation.checkInputString("Assignee: ",
                    "^[A-Za-z ]+$");
            String reviewer = Validation.checkInputString("Reviewer: ",
                    "^[A-Za-z ]+$");

            task = new Task(taskID, taskTypeName, rName, date,
                    from, to, assign, reviewer);
        } catch (Exception e) {
            System.out.println("There're an error found!");
        }
        return task;
    }

    public Task inputUpdateTask(ArrayList<Task> listTask) {
        Task taskUpdate = new Task();

        while (true) {
            //user input taskID
            int taskID = Validation.checkIntLimit("Requirement ID: ",
                    1, Integer.MAX_VALUE);
            //check id exist or not
            int idCheck = Validation.checkIDExist(taskID, listTask);
            if (idCheck != -1) {
                //call method input
                taskUpdate = inputTask(listTask, taskID);
                break;
            }
            System.err.println("TaskID does not exist!");
        }
        //return object taskUpdate
        return taskUpdate;
    }

    /**
     * This method used to addTask
     *
     * @param listTask
     * @return
     * @throws Exception
     */
    @Override
    public ArrayList addTask(ArrayList<Task> listTask) throws Exception {
        System.out.println("\n---------- Add Task ----------");

        //declare taskID;
        int taskID = 1;
        //auto count taskID + 1
        if (!listTask.isEmpty()) {
            taskID = listTask.get(listTask.size() - 1).getID() + 1;
        }
        
        //call method input
        Task taskAdd = inputTask(listTask, taskID);

        //add Task object to listTask
        listTask.add(taskAdd);
        System.out.println("Add Success!!\n");
        return listTask;
    }

    /**
     * This method used to update Task
     *
     * @param listTask
     * @throws Exception
     */
    @Override
    public ArrayList updateTask(ArrayList<Task> listTask)
            throws Exception {
        System.out.println("\n--------- Update Task ---------");
        
        //check listTask empty or not
        if (listTask.isEmpty()) {
            System.out.println("List Task Empty!\n");
            return null;
        }
        
        //call method input to input require data
        Task taskUpdate = inputUpdateTask(listTask);

        //check if data input equals "nope" or not
        if (!(taskUpdate.getRequirementName().equalsIgnoreCase("nope")
                || taskUpdate.getAssignee().equalsIgnoreCase("nope")
                || taskUpdate.getAssignee().equalsIgnoreCase("nope"))) {

            //update task by taskID
            listTask.set(taskUpdate.getID() - 1, taskUpdate);
            System.out.println("Update Task Success!!\n");
        }
        return listTask;
    }

    /**
     * This method used to delete Task by user enter TaskID
     *
     * @param listTask
     * @throws Exception
     */
    @Override
    public void deleteTask(ArrayList<Task> listTask) throws Exception {
        //check if listTask empty or not
        System.out.println("\n--------- Delete Task ---------");
        if (listTask.isEmpty()) {
            System.out.println("List Task Empty!\n");
            return;
        }

        try {
            int taskID;
            while (true) {
                //get taskID input by user
                taskID = Validation.checkIntLimit("ID: ", 1, Integer.MAX_VALUE);

                int validID = Validation.checkIDExist(taskID, listTask);
                
                //check if validID return to -1 mean id Task enter does not exist
                if (validID != -1) {
                    break;
                }
                System.err.println("TaskID does not exist! "
                        + "Please enter ID from " + listTask.get(0).getID()
                        + " to " + listTask.get(listTask.size() - 1).getID());
            }
            //Remove task
            listTask.remove(taskID - 1);
            System.out.println("Delete TaskID " + taskID + " Success!"
            );
        } catch (Exception e) {
            System.out.println("Delete Task Fail!");
        }
    }

    /**
     * This method used to Display Task Value Descending
     *
     * @param listTask
     * @throws Exception
     */
    @Override
    public void getDataTasks(ArrayList<Task> listTask, String formatDate) throws Exception {
        if (listTask.isEmpty()) {
            System.err.println("List Task Empty!");
            return;
        }

        System.out.println("\n----------------------------------"
                + " Task descending order "
                + "----------------------------------");

        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");

        //Date format
        SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
        String dateString = "";

        //display task descending
        for (int i = 0; i < listTask.size(); i++) {
            System.out.printf("%-5d%-15s%-15s%-15s%-15.1f%-15s%-15s\n",
                    listTask.get(i).getID(),
                    listTask.get(i).getRequirementName(),
                    listTask.get(i).getTaskTypeID(),
                    dateString = sdf.format(listTask.get(i).getDate()),
                    listTask.get(i).getToPlan() - listTask.get(i).getFromPlan(),
                    listTask.get(i).getAssignee(),
                    listTask.get(i).getReviewer()
            );
        }
    }

}
