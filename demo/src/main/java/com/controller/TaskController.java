package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.util.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import com.model.Task;

public class TaskController {

    public void save(Task task) {
        String sql = "INSERT INTO  Tasks ("
        + "idProject"
        + ", namev"
        + ", descriptionv"
        + ", isDone"
        + ", observation"
        + ", createdAt"
        + ", updatedAt"
        + ", deadLine"
        + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.getIsDone());
            statement.setString(5, task.getObservation());
            statement.setDate(6, new Date(task.getCreatedAt().getTime()));
            statement.setDate(7, new Date(task.getUpdatedAt().getTime()));
            statement.setDate(8, new Date(task.getDeadLine().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao criar a tarefa." + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void update(Task task) {
        String sql = "UPDATE Tasks SET "
         + "idProject = ?"
        + ", namev = ?"
        + ", descriptionv = ?"
        + ", isDone = ?"
        + ", observation = ?"
        + ", createdAt = ?"
        + ", updatedAt = ?"
        + ", deadLine = ?"
        + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.getIsDone());
            statement.setString(5, task.getObservation());
            statement.setDate(6, new Date(task.getCreatedAt().getTime()));
            statement.setDate(7, new Date(task.getUpdatedAt().getTime()));
            statement.setDate(8, new Date(task.getDeadLine().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao alterar a tarefa." + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void deleteById(int taskId) {
        String sql = "DELETE FROM Tasks WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa." + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public List<Task> getAll(int idProject) {
        String sql = "SELECT * FROM Tasks WHERE idProject = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Task> tasks = new ArrayList<Task>();
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, idProject);
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("namev"));
                task.setDescription(resultSet.getString("descriptionv"));
                task.setIsDone(resultSet.getBoolean("isDone"));
                task.setObservation(resultSet.getString("observation"));
                task.setDeadLine(resultSet.getDate("deadLine"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                tasks.add(task);
            }

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao buscar a tarefa." + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return tasks;
    }
}
