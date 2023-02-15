package com.todoro;

import java.sql.Connection;
import com.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Connection c = ConnectionFactory.getConnection();

        ConnectionFactory.closeConnection(c);
        System.out.println("End!");
    }        
}
