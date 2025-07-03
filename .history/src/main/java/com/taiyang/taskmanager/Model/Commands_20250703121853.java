package com.taiyang.taskmanager.Model;

public class Commands {
    
    public static void init(){
        String[] commandList = {
            "--help\n Display all commands",
             "--all / -a \n Display all Tasks",
              "--allopen / -ao \n Display all Open / Unfinished Tasks",
               "--allclosed / -ac \n Display all Closed / Finished Tasks",
               "--update [taskna] / -u \n Update a task by name"
            };

    }
  
    
}
