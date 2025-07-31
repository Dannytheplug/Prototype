package com.example.Week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        final String HOST = "localhost";
        final int PORT = 1234;

        try (Socket socket = new Socket(HOST, PORT)){
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter serverWriter = new PrintWriter(socket.getOutputStream(), true);


            System.out.println("EEnter your name: ");
            String name = userInput.readLine();
            serverWriter.println(name);

            new Thread(()->(String serverMsg; try{while ((serverMsg ))})).start();
            String msg;
            while ((msg = userInput.readLine()) !=null)

        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
