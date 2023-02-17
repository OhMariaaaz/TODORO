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

    }        
}
