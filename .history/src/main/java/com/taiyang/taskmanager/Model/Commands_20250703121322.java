package com.taiyang.taskmanager.Model;

public class Commands {
    public Commands(String title, String description){
        this.title = title;
        this.description = description;
    };
    public static void init(){

    }
    public String listCommands(){
        return commands;
    }
    
}
