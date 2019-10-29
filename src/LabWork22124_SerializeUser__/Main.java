/*package LabWork22124_SerializeUser__;



import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

import static com.oracle.jrockit.jfr.ContentType.Bytes;*/
/*
public class Main {
    public static void main(String[] args) throws IOException {


        User user = new User("Sasha", "Ivanov",25);
        RandomAccessFile file = null;
        file = new RandomAccessFile("D:\\user.ser", "rw");
        file.writeUTF(new String[]{"Ivan", "Sedov", "28"});
        file.seek(0);
        file.writeUTF({"","",""});
        file.seek(0);
        byte[] buf = new byte[][30];
        String n = String.valueOf(file.read(buf,0,3));
        System.out.println(Arrays.toString());
        file.close();




        String text = file.readLine();
        file.writeBytes("Gregory");
        System.out.println(file.readByte());
        file.close();
        FileOutputStream fos = new FileOutputStream("D:\\user.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//??????????        2) Create a class Main with a main() method, which crehe ates an instance User and
//        adds it to t"users.ser" file using serialization (Note, to append to a file, use class
//        RandomAccessFile and a method of writeBytes(String ...));
//        3) Add code in a main() method that reads from a file "users.ser" using de-serialization
//        all users and prints them to the console.

        //        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println(user.toString());
    }*/

/*
    try {
        String filePath = "/Users/prologistic/source.txt";
        System.out.println(new String(readCharsFromFile(filePath, 1, 5)));

        writeData(filePath, "Data", 5);
    } catch (IOException e) {
        e.printStackTrace();
    }

    // метод для записи данных в файл
    private static void writeData(String filePath, String data, int seek) throws IOException {
        // открываем файл с возможностью как чтения, так и записи
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        // переходим на определенный индекс
        file.seek(seek);
        // запишем данные в этом месте
        file.write(data.getBytes());
        file.close();
    }

    // метод для чтения с файла
    private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
        // открываем файл только для чтения
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(seek);
        byte[] bytes = new byte[chars];
        file.read(bytes);
        file.close();
        return bytes;
    }
*/

