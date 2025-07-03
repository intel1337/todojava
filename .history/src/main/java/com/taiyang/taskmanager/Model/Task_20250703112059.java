package com.taiyang.taskmanager.Model;

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
    public String createTask(String title, String description, Boolean status){
        try {
            Task newtask = new Task(title, description, status);
            retur
            
        } catch (Exception e) {
           return e.toString();
        }
    }

    public String getAllTasks(){
        String[] Tasks = ;
        return 
    }

    
}
