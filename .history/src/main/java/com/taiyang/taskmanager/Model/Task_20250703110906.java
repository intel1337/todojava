package com.taiyang.taskmanager.Model;

public class Task {
    private String title;
    private String description;
    private Boolean status;

    public Task(String title, String description, Boolean status) {
        this.title = title;
        this.description = description;

        
    };
    public stTest(){
        Task unittest = new Task("Manger", "Manger un burger", false);
        System.out.println(unittest);
        return 0;
    }

    
}
