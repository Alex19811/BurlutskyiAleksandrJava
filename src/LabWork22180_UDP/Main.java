package LabWork22180_UDP;

/*1) public  DatagramSocket () генерирует исключение SocketException
        Создает сокет дейтаграммы и связывает его с любым доступным портом на локальном хост-компьютере.

        2) публичный  DatagramSocket (int port) выдает исключение SocketException

        Создает сокет дейтаграммы и привязывает его к указанному порту на локальном хосте.

        Методы:

        1) public void receive (DatagramPacket p) выдает IOException
        Получает пакет дейтаграммы из этого сокета. Когда этот метод возвращается,
        буфер DatagramPacket заполняется полученными данными. Пакет дейтаграмм также
         содержит IP-адрес отправителя и номер порта на машине отправителя. Этот метод
          блокируется до получения дейтаграммы. Поле длины объекта пакета дейтаграммы
           содержит длину принятого сообщения. Если сообщение длиннее, чем длина пакета, сообщение усекается.

        2) public void send (DatagramPacket p) выбрасывает IOException

        Посылает пакет дейтаграммы из этого сокета. DatagramPacket включает в себя информацию,
         указывающую данные , которые должны быть отправлены, его длину, IP - адрес удаленного
          хоста и номер порта на удаленном хосте.*/


/*Datagram Packet

    Этот класс представляет пакет дейтаграммы.

        Пакеты дейтаграмм используются для реализации службы доставки пакетов без установления
        соединения. Каждое сообщение направляется с одного компьютера на другой исключительно
        на основе информации, содержащейся в этом пакете. Несколько пакетов, отправленных с
        одного компьютера на другой, могут маршрутизироваться по-разному и могут поступать
        в любом порядке. Доставка пакетов не гарантируется.

        Этот фрагмент кода показывает, как воспринимать информацию как дейтаграмму.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Main<sendPacket> {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
       /* Datagram Packet

        Этот класс представляет пакет дейтаграммы.

                Пакеты дейтаграмм используются для реализации службы доставки
                 пакетов без установления соединения. Каждое сообщение направляется
                  с одного компьютера на другой исключительно на основе информации,
                   содержащейся в этом пакете. Несколько пакетов, отправленных с одного
                   компьютера на другой, могут маршрутизироваться по-разному и могут
                    поступать в любом порядке. Доставка пакетов не гарантируется.

        Этот фрагмент кода показывает, как воспринимать информацию как дейтаграмму.*/
        DatagramSocket serverSoket = new DatagramSocket(9999);
        byte[] receiveData = new byte[1024];
        while (true) {
            DatagramPacket receinePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSoket.receive(receinePacket);
            String sentence = new String(receinePacket.getData());
            System.out.println("RECEIVED: " + sentence);
        }
    }

    //Этот фрагмент кода показывает, как отправить сообщение в виде дейтаграммы.
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    DatagramSocket clientSocket = new DatagramSocket();
    InetAddress IPAddress = InetAddress.getByName("localhost");
    String sentence = in.readLine();
    byte[] sendData = sentence.getBytes();
    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress,9999);
   // clientSocket.send(sendPacket);
}

