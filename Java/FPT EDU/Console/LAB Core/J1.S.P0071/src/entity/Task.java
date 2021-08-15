/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Ryuu
 */
public class Task {
    private int ID;
    private String TaskTypeID;
    private String RequirementName;
    private Date Date;
    private double FromPlan;
    private double ToPlan;
    private String Assignee;
    private String Reviewer;
//    private String Expert;

    public Task() {
    }

    public Task(int ID, String TaskTypeID, String RequirementName, Date Date, 
            double FromPlan, double ToPlan, String Assignee, String Reviewer) {
        this.ID = ID;
        this.TaskTypeID = TaskTypeID;
        this.RequirementName = RequirementName;
        this.Date = Date;
        this.FromPlan = FromPlan;
        this.ToPlan = ToPlan;
        this.Assignee = Assignee;
        this.Reviewer = Reviewer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTaskTypeID() {
        return TaskTypeID;
    }

    public void setTaskTypeID(String TaskTypeID) {
        this.TaskTypeID = TaskTypeID;
    }

    public String getRequirementName() {
        return RequirementName;
    }

    public void setRequirementName(String RequirementName) {
        this.RequirementName = RequirementName;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public double getFromPlan() {
        return FromPlan;
    }

    public void setFromPlan(double FromPlan) {
        this.FromPlan = FromPlan;
    }

    public double getToPlan() {
        return ToPlan;
    }

    public void setToPlan(double ToPlan) {
        this.ToPlan = ToPlan;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssignee(String Assignee) {
        this.Assignee = Assignee;
    }

    public String getReviewer() {
        return Reviewer;
    }

    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    @Override
    public String toString() {
        return "Task{" + "ID=" + ID + ", TaskTypeID=" + TaskTypeID + ", RequirementName=" + RequirementName + ", Date=" + Date + ", FromPlan=" + FromPlan + ", ToPlan=" + ToPlan + ", Assignee=" + Assignee + ", Reviewer=" + Reviewer + '}';
    }
}
