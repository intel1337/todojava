package com.taiyang.taskmanager.Model;

import java.lang.reflect.Array;

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
    public String createTask(Array database,String title, String description, Boolean status){
        try {
            Task newtask = new Task(title, description, status);
            Array dat

            return "Sucessefully created task" + title;
            
        } catch (Exception e) {
           return e.toString();
        }
    }

    public void initTasks(){
        
    }

    
}
