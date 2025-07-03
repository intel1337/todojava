package com.taiyang.taskmanager;

import java.util.ArrayList;
import com.taiyang.taskmanager.Model.Task;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Task> database = new ArrayList<Task>();
        Task GlobalTaskManager = new Task("Manager", "Init", false);
        System.out.println( "Welcome to the todo List" );
        System.out.println("Here is the list of ");
        System.out.println(GlobalTaskManager.getAllTasks(database)); 
    }
}
