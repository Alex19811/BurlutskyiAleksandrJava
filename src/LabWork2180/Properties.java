/*
package LabWork2180;

import java.io.FileInputStream;
import java.io.IOException;

public class Properties {
    public static void main(String[] args) {
        Properties property = new Properties();
        try (FileInputStream fis =  new FileInputStream("config.properties")){
            property.load(fis);
            String host = property.getProperty("dbhost");
            String login = property.getProperty("dblogin");
            String password = property.getProperty("dbpassword");
            System.out.println("HOST: " + host
            + ", LOGIN: " + login
            + ", PASSWORD: " + password);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Properties() {
    }

    private String getProperty() {
    }

    private void load(FileInputStream fis) {
    }
}
*/
