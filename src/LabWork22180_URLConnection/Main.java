package LabWork22180_URLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Абстрактный класс  URLConnection  является суперклассом всех классов, которые представляют собой канал
   связи между приложением и URL-адресом. Экземпляры этого класса могут использоваться как для чтения, так и
    для записи в ресурс, на который ссылается URL. Как правило, создание соединения с URL-адресом является
     многошаговым процессом:

        openConnection () - манипулирует параметрами, которые влияют на соединение с удаленным ресурсом

        connect () - взаимодействовать с ресурсом; поля и содержимое заголовка запроса


        1. Объект подключения создается путем вызова   метода openConnection для URL-адреса.

        2. Параметры настройки и общие свойства запроса обрабатываются.

        3. Фактическое соединение с удаленным объектом осуществляется с использованием метода connect.

        4. Удаленный объект становится доступным. Поля заголовка и содержимое удаленного объекта могут быть доступны.*/
        URL oracle = new URL("http://www.brainacad.com");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine())!= null)
        System.out.println(inputLine);
in.close();


        /*IP-адрес - это 32-разрядное или 128-разрядное число без знака, используемое IP, протокол более
        низкого уровня, на котором построены такие протоколы, как UDP и TCP.*/
        InetAddress ip = InetAddress.getByName("http://www.brainacad.com");
        System.out.println("Host Name: " + ip.getHostName());
        System.out.println("IP Address: " + ip.getHostAddress());

    }
}

