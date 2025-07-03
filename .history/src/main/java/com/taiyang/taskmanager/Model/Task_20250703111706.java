package com.taiyang.taskmanager.Model;

public class Task {
    private String title;
    private String description;
    private Boolean status;
    @Override
    public String toString() {
    return "Task{title='" + title + "', description='" + description + "', status=" + status + "}";
    }

    public Task(String title, String description, Boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;

        
    };
    public void test(){
        Task unittest = new Task("Manger", "Manger un burger", false);
        System.out.println(unittest.to
    }
    public String getAllTasks

    
}
