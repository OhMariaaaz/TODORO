package com.todoro;

import java.sql.Connection;

import com.util.ConnectionFactory;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Connection c = ConnectionFactory.getConnection();

        ConnectionFactory.closeConnection(c);
    }
}
