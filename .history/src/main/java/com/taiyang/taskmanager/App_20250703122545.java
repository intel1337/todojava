import java.util.ArrayList;
import com.taiyang.taskmanager.Model.Task;
import com.taiyang.taskmanager.Model;

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
                    System.out.println(GlobalTaskManager.getAllTasks(database));
                    break;
                case "--help":
                    String[]commands = Commands.init();
                    if (commands != null) {
                        // Assuming Commands has a method to get command list
                        // You'll need to implement this based on your Commands class
                        System.out.println("Liste des commandes disponibles:");
                        // Add your command display logic here
                    }
                    break;
                default:
                    System.out.println("Commande inconnue. Utiliser --help pour la liste des commandes");
                    break;
            }
        }
    }
}