package LabWork22183;

import java.io.*;
import java.net.*;
import java.lang.*;

public class Ponger // SERVER
{
    public void go()
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(24047);

            while(true)
            {
                Socket sock = serverSocket.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());

                for (int i = 0; i < 11; i++)
                {
                    System.out.println("Pong");
                    writer.flush();
                    writer.close();
                }
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        int numPlays = Integer.parseInt(args[0]); // Tried 10 and 0, no luck
        Ponger ponger = new Ponger();
        ponger.go();
    }
}