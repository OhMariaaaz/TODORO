package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.util.ConnectionFactory;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import com.model.Project;

public class ProjectController {

    public void save(Project project) {
        String sql = "INSERT INTO  Projects ("
        + "namev"
        + ", descriptionv"
        + ", createdAt"
        + ", updatedAt"
        + " ) VALUES (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao criar o projeto." + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void update(Project project) {
        String sql = "UPDATE Projects SET "
        + "namev = ?"
        + ", descriptionv = ?"
        + ", createdAt = ?"
        + ", updatedAt = ?"
        + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao alterar o projeto." + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM Projects WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar o projeto." + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(conn, statement);
        }
    }

    public List<Project> getAll(int id) {
        String sql = "SELECT * FROM Projects";
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Project> projects = new ArrayList<Project>();
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                Project project = new Project();
                
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                projects.add(project);
            }

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao buscar o projeto." + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(conn, statement, resultSet);
        }

        return projects;
    }
}
