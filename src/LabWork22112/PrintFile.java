package LabWork22112;

import java.io.*;

public class PrintFile {
   // class ConsoleRead {
        public static void main(String[] args) {
            try {
                File file = new File("C:\\file.txt");


                InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader

                FileWriter fileReader = new FileWriter(file); // поток который подключается к текстовому файлу
                BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // соединяем FileWriter с BufferedWriter

                String line;
                while(!(line = bufferedReader.readLine()).equals("exit")) {
                    bufferedWriter.write(line);
                }

                bufferedReader.close(); // закрываем поток
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

//    • Откройте  FileReader,  а затем оберните его  BufferedReader,  чтобы вы могли использовать метод  readLine ()  для получения строки ввода.
  //          • Обратите внимание, что  readLine ()  удаляет символ '\ n' с конца строки, поэтому используйте  System.out.println (),  чтобы разбить строки.

