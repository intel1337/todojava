package com.taiyang.taskmanager.Model;

public class Commands {
    public Commands(String title, String description){
        this.title = title;
        this.description = description;
    };
    public static init(){
        
    }
    public String listCommands(){
        return commands;
    }
    
}
