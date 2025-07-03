package com.taiyang.taskmanager;
import java.util.ArrayList;
import com.taiyang.taskmanager.Model.Task;
im

public class App {
    public static void main(String[] args) {
        String[] argument = args;
        ArrayList<Task> database = new ArrayList<Task>();
        Task GlobalTaskManager = new Task("Manager", "Init", false);
        
        System.out.println("Bienvenue sur la ToDoList \n");
        
        if(argument.length == 0) {
            System.out.println("Utiliser --help pour la liste des commandes");
        } else {
            String command = argument[0];
            switch (command) {
                case "--all":
                case "-a":
                    System.out.println(GlobalTaskManager.getAllTasks(database));
                    break;
                case "--allopen":
                case "-ao":
                    System.out.println(GlobalTaskManager.getOnlyOnGoingTask(database));
                    break;
                case "--allclosed":
                case "-ac":
                    System.out.println(GlobalTaskManager.getOnlyClosedTask(database));
                    break;
                case "--add":
                    if (argument.length >= 3) {
                        String title = argument[1];
                        String description = argument[2];
                        System.out.println(GlobalTaskManager.createTask(database, title, description, false));
                    } else {
                        System.out.println("Usage: --add [title] [description]");
                    }
                    break;
                case "--update":
                case "-u":
                    if (argument.length >= 2) {
                        String taskTitle = argument[1];
                        System.out.println(GlobalTaskManager.updateTask(database, taskTitle));
                    } else {
                        System.out.println("Usage: --update [taskname]");
                    }
                    break;
                case "--help":
                    String[] commands = Commands.init();
                    if (commands != null) {
                        System.out.println("Liste des commandes disponibles:");
                        for (String cmd : commands) {
                            System.out.println(cmd);
                        }
                    }
                    break;
                default:
                    System.out.println("Commande inconnue. Utiliser --help pour la liste des commandes");
                    break;
            }
        }
    }
}