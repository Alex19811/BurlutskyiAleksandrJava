package LabWork22124_SerializeUser__;


import java.io.IOException;
import java.io.RandomAccessFile;


public class Main {
    public static void main(String[] args) throws IOException {


        User user = new User("Sasha", "Ivanov", 25);
        RandomAccessFile file = new RandomAccessFile("D:\\users.ser", "rw");
        //user.setLastName("Gregory ");
        file.writeBytes("Gregory ");
        file.writeBytes("Petrov ");
        file.writeBytes("22 ");
        //перемещаем «курсор» на 0-й символ.
        file.seek(0);
        //читаем строку, начиная с текущего положения курсора и до конца строки
        String text = file.readLine();
        System.out.println(text);
        //закрываем файл
        file.close();


        RandomAccessFile file1 = new RandomAccessFile("D:\\users.ser", "rw");
        //читаем строку, начиная с текущего положения курсора и до конца строки
//        file1.seek(0);
//        String text1 = file1.readLine();
//        System.out.println(text1);
//        file1.read();
        System.out.println(file1.readByte());
        System.out.println(user.toString());
        file1.close();

    }
}


//        FileOutputStream fos = new FileOutputStream("D:\\user.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);

//??????????        2) Create a class Main with a main() method, which crehe ates an instance User and
//        adds it to t"users.ser" file using serialization (Note, to append to a file, use class
//        RandomAccessFile and a method of writeBytes(String ...));
//        3) Add code in a main() method that reads from a file "users.ser" using de-serialization
//        all users and prints them to the console.

//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        try {
//            oos.writeObject(user);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            oos.close();
//        }
        /*System.out.println(user.toString());
    }
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

