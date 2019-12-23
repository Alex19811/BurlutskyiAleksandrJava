package LabWork22180_Networking;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student std = new Student("Alex", "Java SE");

        try (Socket socket = new Socket("localhost", 8899)) {
            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            os.writeObject(std);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
