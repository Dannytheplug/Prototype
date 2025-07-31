package com.example.Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);


        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("hi server!");
        String reply = in.readLine();
        System.out.println("server reply: " + reply);
        out.close();
        in.close();
        socket.close();
    }
}
