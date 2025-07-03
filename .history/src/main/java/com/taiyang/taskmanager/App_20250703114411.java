package com.taiyang.taskmanager;

import java.util.ArrayList;
import com.taiyang.taskmanager.Model.Task;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Task> database = new ArrayList<Task>();
        Task GlobalTaskManager = new Task("Manager", "Init", false);
        GlobalTaskManager.createTask(database, "Test", "salut", false);
        GlobalTaskManager.createTask(database, "2", "3", false);
        GlobalTaskManager.createTask(database, "Test", "salsut", true);



       syst GlobalTaskManager.getAllTasks(database);
        System.out.println( "Welcome to the todo List" );
    }
}
