package com.example.Week6;

import java.io.*;
import java.net.Socket;
import java.util.Set;

public class ClientHandler implements Runnable{
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private Set<ClientHandler> clients;

    public ClientHandler(Socket socket, Set<ClientHandler> clients) throws IOException{
        this.socket = socket;
        this.clients = clients;

        try{
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessage(String msg){
        writer.println(msg);
    }

    @Override
    public void run() {
        try {
            String name = reader.readLine();
            broadCast(name + ": new join chat  ");
            String msg ;

            while ((msg = reader.readLine()) !=null){
                broadCast(name + " : " + msg);
            }
        } catch (IOException e) {
            System.out.println(" client disconnected ");
        } finally {
            try {
                socket.close();
                clients.remove(this);
                broadCast("a user has left the chat ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    private void broadCast(String msg) {
        for (ClientHandler client : clients){
            client.sendMessage(msg);
        }
    }
}
