package com.model;
import java.util.Date;

public class Task {

    private int id;
    private String name;
    private String description;
    private boolean isDone;
    private String observation;
    private Date createdAt;
    private Date updatedAt;
    private Date deadLine;
    private int idProject;


    public Task(int id, String name, String description, boolean isDone, String observation, Date createdAt, Date updatedAt, Date deadLine, int idProject){
        this.id = id;
        this.name = name;
        this.description = description;
        this.isDone = isDone;
        this.observation = observation;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deadLine = deadLine;
        this.idProject = idProject;
    }

    public Task(){
        this.createdAt = new Date();
        this.updatedAt = new Date();
        this.deadLine = new Date();
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

    public void setIsDone(Boolean isDone){
        this.isDone = isDone;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public void setObservation(String observation){
        this.observation = observation;
    }

    public String getObservation(){
        return observation;
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

    public void setDeadLine(Date deadLine){
        this.deadLine = deadLine;
    }

    public Date getDeadLine(){
        return deadLine;
    }

    public void setIdProject(int idProject){
        this.idProject = idProject;
    }

    public int getIdProject(){
        return idProject;
    }

    public String toString(){
        return "Task{" + "id=" + id + ", name=" + name + ", description=" + description + ", observation=" + observation + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deadLine=" + deadLine + ", idProject" + idProject + "}";   
    }
}