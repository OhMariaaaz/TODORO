package com.model;
import java.util.Date;

public class Project {

    private int id;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    public Project(){
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public Project(int id, String name, String description, Date createdAt, Date updatedAt){
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
        return createdAt;
    }

    public void setUpdatedAt(Date updatedAt){
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt(){
        return updatedAt;
    }

    public String toString(){
        return "Project{" + "id=" + id + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "}";   
    }
}
