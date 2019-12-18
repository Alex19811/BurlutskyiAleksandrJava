package LabWork22180_Networking;

import com.sun.corba.se.spi.activation.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(8899);
        System.out.println("Server is Running");
        try {
            System.out.println("Waiting for connection...");
            Socket soket = listener.accept();
            System.out.println("Client connection...");
soket.getOutputStream().write(Integer.parseInt("Hello! from Server!"));
soket.getOutputStream().flush();
soket.getOutputStream().close();
soket.close();

        }catch (Exception e){
            Socket socket = new Socket("localhost", 8899);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
        }
    }

   /* Socket s = new Socket();
    String host = "www.brainacad.com";
    PrintWriter out = null;
    BufferedReader in = null;
    try{
        s.connect(new InetSocketAddress(host,80));
        System.out.println("Connected");
        out = new PrintWriter(s.getOutputStream(),true);
        in = BufferedReader(new InputStreamReader(s.getInputStream()));
    }catch (UnknownHostException e){

    }*/



}

