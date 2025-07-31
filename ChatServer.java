package com.example.Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server is waiting for client");
        Socket socket = serverSocket.accept();
        System.out.println("client connected");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String clientMsg,serverMsg;
        while((clientMsg = reader.readLine()) != null){
            System.out.println("client: " + clientMsg);
            System.out.println("You");
            serverMsg = console.readLine();
            writer.println(serverMsg);
        }
        socket.close();
    }
}
