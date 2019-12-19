package LabWork22183;

import java.io.*;
import java.net.*;
import java.lang.*;
public class Pinger // CLIENT
{
    public void go()
    {
        try
        {
            Socket s = new Socket("127.0.0.1", 24047);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader  = new BufferedReader(streamReader);
            PrintWriter writer = new PrintWriter(s.getOutputStream());

            for (int i = 0; i < 11; i++)
            {
                System.out.println("Ping");

                writer.flush();
                writer.close();
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        int numPlays = Integer.parseInt(args[0]); // I tried 10 and 0, no luck
        Pinger pinger = new Pinger();
        pinger.go();
    }
}