package LabWork22180_Networking;



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

            /*В примере создается сокет, тем самым получая соединение с сервером.
              Затем создает поток чтения на этом сокете, а затем читает и
              отображает данные, переданные ему с сервера.*/
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

    /*Конструкторы Сокетов

1) public  Socket ()
        Создает неподключенный сокет с системным типом по умолчанию SocketImpl.

        2) public Socket (String host, int port) выбрасывает UnknownHostException, IOException

        Создает сокет потока и подключает его к указанному номеру порта на указанном хосте. Если указанный хост имеет значение null, это эквивалентно указанию адреса как InetAddress.getByName (null) . Другими словами, это эквивалентно указанию адреса интерфейса обратной связи.

        методы

        1) public  InputStream  getInputStream () выбрасывает IOException
        Возвращает входной поток для этого сокета.

        2) public  OutputStream  getOutputStream () выбрасывает IOException

        Возвращает поток вывода для этого сокета.

        3) public void  close () выдает IOException

        Закрывает эту розетку. Любой поток, в настоящее время заблокированный в операции ввода-вывода на этом сокете, вызовет исключение SocketException .

        4) public void  connect ( конечная  точка SocketAddress ) выбрасывает IOException*/