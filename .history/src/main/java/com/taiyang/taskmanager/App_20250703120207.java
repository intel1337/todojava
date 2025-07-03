package com.taiyang.taskmanager;

import java.util.ArrayList;
import com.taiyang.taskmanager.Model.Task;

public class App 
{
    public static void main( String[] args,  )
    {
        String argument = args[0];
        ArrayList<Task> database = new ArrayList<Task>();
        Task GlobalTaskManager = new Task("Manager", "Init", false);
        System.out.println( "Bienvenue sur la ToDoList \n" );
        if(!argument){
        System.out.println("Utiliser --help pour la liste des commandes");


        }
        System.out.println(GlobalTaskManager.getOnlyOnGoingTask(database)); 
    }
 }