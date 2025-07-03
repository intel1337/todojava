package com.taiyang.taskmanager.Model.ta;

import java.util.ArrayList;

public class Task {
    private String title;
    private String description;
    private Boolean status;
    public ArrayList<Task> database;

    public Task(String title, String description, Boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;

    };

    public Boolean getStatus() {
        return status;
    }

    public String createTask(ArrayList<Task> database, String title, String description, Boolean status) {
        try {
            Task newtask = new Task(title, description, status);
            database.add(newtask);
            return "Sucessefully created task :" + title + "\n";
        }

        catch (Exception e) {
            return e.toString();
        }
    }

    public String getAllTasks(ArrayList<Task> database) {
        String result = "Voici la liste de tasks : \n";

        for (int i = 0; i < database.size(); i++) {
            result += (i + 1) + ". " + database.get(i) + "\n";
        }

        return result;
    }

    public String getOnlyOnGoingTask(ArrayList<Task> database) {
        String result = "Voici la liste de tasks en cours : \n";
        int counter = 1;

        for (int i = 0; i < database.size(); i++) {
            if (!database.get(i).getStatus()) { // Utilise un getter
                result += counter + ". " + database.get(i) + "\n";
                counter++;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return title + " - " + description + " [" + (status ? "Terminé" : "En cours") + "]";
    }

}
