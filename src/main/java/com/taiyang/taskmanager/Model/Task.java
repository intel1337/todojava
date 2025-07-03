package com.taiyang.taskmanager.Model;
import java.util.ArrayList;

public class Task {
    private String title;
    private String description;
    private Boolean status;
    
    public Task(String title, String description, Boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }
    
    // Getters
    public Boolean getStatus() {
        return status;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    
    // Setters
    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String createTask(ArrayList<Task> database, String title, String description, Boolean status) {
        try {
            Task newtask = new Task(title, description, status);
            database.add(newtask);
            return "Successfully created task: " + title + "\n";
        } catch (Exception e) {
            return "Error creating task: " + e.toString();
        }
    }
    
    public String getAllTasks(ArrayList<Task> database) {
        if (database.isEmpty()) {
            return "Aucune tâche trouvée.\n";
        }
        
        String result = "Voici la liste de toutes les tâches : \n";
        for (int i = 0; i < database.size(); i++) {
            result += (i + 1) + ". " + database.get(i) + "\n";
        }
        return result;
    }
    
    public String getOnlyOnGoingTask(ArrayList<Task> database) {
        String result = "Voici la liste des tâches en cours : \n";
        int counter = 1;
        boolean hasOngoingTasks = false;
        
        for (int i = 0; i < database.size(); i++) {
            if (!database.get(i).getStatus()) {
                result += counter + ". " + database.get(i) + "\n";
                counter++;
                hasOngoingTasks = true;
            }
        }
        
        if (!hasOngoingTasks) {
            result += "Aucune tâche en cours.\n";
        }
        
        return result;
    }
    
    public String getOnlyClosedTask(ArrayList<Task> database) {
        String result = "Voici la liste des tâches terminées : \n";
        int counter = 1;
        boolean hasClosedTasks = false;
        
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getStatus()) {
                result += counter + ". " + database.get(i) + "\n";
                counter++;
                hasClosedTasks = true;
            }
        }
        
        if (!hasClosedTasks) {
            result += "Aucune tâche terminée.\n";
        }
        
        return result;
    }
    
    public String updateTask(ArrayList<Task> database, String taskTitle) {
        for (Task task : database) {
            if (task.getTitle().equalsIgnoreCase(taskTitle)) {
                task.setStatus(!task.getStatus());
                String statusText = task.getStatus() ? "terminée" : "en cours";
                return "Tâche '" + taskTitle + "' mise à jour: " + statusText + "\n";
            }
        }
        return "Tâche '" + taskTitle + "' non trouvée.\n";
    }
    
    @Override
    public String toString() {
        return title + " - " + description + " [" + (status ? "Terminé" : "En cours") + "]";
    }
}