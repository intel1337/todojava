package com.taiyang.taskmanager;

import java.util.ArrayList;
import com.taiyang.taskmanager.Model.Task;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Task> database = new ArrayList<Task>();
        Task Tester = new Task("Manger", "Manger dehors", null)
        System.out.println( "Welcome to the todo List" );
        Task.getAllTasks(database);
    }
}
