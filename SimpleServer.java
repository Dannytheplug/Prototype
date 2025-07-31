package com.example.Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(1234);
        System.out.println("server waiting for client ");

        Socket client = socket.accept();
        System.out.println("Client connected ");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        String line = in.readLine();
        System.out.println("Receieved" + line);
        out.println("Hello from the server!");

        in.close();
        out.close();
        client.close();
        socket.close();


    }
}
