package LabWork22180_Networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (
                ServerSocket listener = new ServerSocket(8899)) {
            Socket socket = listener.accept();
            ObjectInputStream oi = new ObjectInputStream(socket.getInputStream());
           Student std = (Student) oi.readObject();
            System.out.println(std);
            oi.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
