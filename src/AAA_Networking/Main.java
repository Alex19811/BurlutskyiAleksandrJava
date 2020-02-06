package AAA_Networking;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket listener = new ServerSocket(8899);
            System.out.println("Serv...");
            while (true) {
                Socket s = listener.accept();
                System.out.println("S conn...");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

        /*  Socket s= null;
        ServerSocket server = new ServerSocket(8080);
        s=server.accept();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.print("HHH");*/


