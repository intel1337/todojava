package com.taiyang.taskmanager.Model;

import java.lang.reflect.Array;

import java.util.ArrayList;

public class Task {
    private String title;
    private String description;
    private Boolean status;
  
    public Task(String title, String description, Boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;
    };
    public void test(){
        Task unittest = new Task("Manger", "Manger un burger", false);
        System.out.println(unittest.toString());
    }
    public String createTask(ArrayList<Task> database, String title, String description, Boolean status){
        try {
            Task newtask = new Task(title, description, status);
            database.add(newtask);
            return "Sucessefully created task :" + title + "\n";
        } 

        catch (Exception e) {
           return e.toString();
        }
    }
    public String getAllTasks(Task){

    }



    
}
