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

        project.setName("Second Project");
        project.setDescription("Testing controllers, methods and database");
        System.out.println(project.toString());
        projectController.save(project);

        project.setName("Alter Project");
        project.setId(5);
        System.out.println(project.toString());
        projectController.update(project);

        projectController.deleteById(1);

        TaskController taskController = new TaskController();
        Task task = new Task();

        task.setName("First task");
        task.setDescription("Testing controllers, methods and database");
        task.setIsDone(false);
        task.setIdProject(5);
        System.out.println(task.toString());
        taskController.save(task);

        task.setName("Alter task");
        task.setId(5);
        task.setIsDone(true);
        System.out.println(task.toString());
        taskController.update(task);

        taskController.deleteById(6);


    }        
}
