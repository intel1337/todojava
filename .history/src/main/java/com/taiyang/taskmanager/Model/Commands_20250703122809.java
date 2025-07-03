package com.taiyang.taskmanager.Model;

public class Commands {
    public static String[] init() {
        String[] commandList = {
            "--help                    Display all commands",
            "--all / -a               Display all Tasks",
            "--allopen / -ao          Display all Open / Unfinished Tasks",
            "--allclosed / -ac        Display all Closed / Finished Tasks",
            "--add [title] [desc]     Add a new task",
            "--update [taskname] / -u Update a task status by name"
        };
        return commandList;
    }
}