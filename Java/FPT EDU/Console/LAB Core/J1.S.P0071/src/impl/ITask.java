/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import entity.Task;
import java.util.ArrayList;

/**
 *
 * @author Ryuu
 */
public interface ITask {
    /** This method used to add new Task by input requirement data
     * 
     * @param taskList
     * @return
     * @throws Exception 
     */
    public ArrayList addTask(ArrayList<Task> taskList) throws Exception;
    
    
    /** This method used to update Task by using TaskID
     * 
     * @param listTask
     * @return 
     * @throws Exception 
     */
    public ArrayList updateTask(ArrayList<Task> listTask) 
            throws Exception;
    
    /** This method used to deleteTask by using TaskID
     * 
     * @param listTask
     * @throws Exception 
     */
    public void deleteTask(ArrayList<Task> listTask) throws Exception;
    
    /** This method used to get List Task Info
     * 
     * @param listTask
     * @param formatDate
     * @throws Exception 
     */
    public void getDataTasks(ArrayList<Task> listTask, String formatDate) 
            throws Exception;
}
