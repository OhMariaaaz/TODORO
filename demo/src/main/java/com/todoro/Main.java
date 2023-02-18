package com.todoro;

import com.controller.*;
import com.model.*;
//import com.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        Project project = new Project();

        project.setName("First Project");
        project.setDescription("Testing controllers, methods and database");
        System.out.println(project.toString());
        projectController.save(project);

        TaskController taskController = new TaskController();
        Task task = new Task();

        task.setName("First task");
        task.setDescription("Testing controllers, methods and database");
        task.setIsDone(false);
        task.setIdProject(1);
        System.out.println(task.toString());
        taskController.save(task);

    }        
}
