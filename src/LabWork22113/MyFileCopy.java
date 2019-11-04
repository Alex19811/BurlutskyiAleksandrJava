package LabWork22113;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileCopy {


        public static void main(String[] args) {
            FileInputStream fis = null;
            FileOutputStream fos = null;

            try {
                fis = new FileInputStream("C:\\Users\\InputFile");
                fos = new FileOutputStream("C:\\Users\\OutputFile");

                int c;

                while ((c = fis.read()) != -1) {
                    fos.write(c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis!=null)fis.close();
                if (fos!=null)fos.close();

                /*

                try {
                    fis.close();
                    fos.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }*/

            }

        }

    }

