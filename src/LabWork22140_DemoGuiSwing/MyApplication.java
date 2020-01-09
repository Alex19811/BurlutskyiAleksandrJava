package LabWork22140_DemoGuiSwing;

import javax.swing.*;
import java.awt.*;

public class MyApplication {
    public static void main(String[] args) {
//Создание окна с указанием названия приложения
        JFrame jfrm = new JFrame("My Program");
        jfrm.setSize(300, 200);
        jfrm.setLocation(100, 200);
        jfrm.setVisible(true);

//создать кнопку
        JFrame jfrm1 = new JFrame("My Program");
        jfrm1.setSize(300, 200);
        jfrm1.setLocation(100, 200);
        jfrm1.setVisible(true);

       JButton jbtn = new JButton("КНОПКА");
        jbtn.setSize(120,50);
        jfrm1.add(jbtn);

// Создать кнопки 5шт

         JFrame jfrm2 = new JFrame("My Program");
        jfrm2.setSize(300, 200);
        jfrm2.setLocation(100, 200);
        jfrm2.setVisible(true);

        JPanel jpan = new JPanel();
        jpan.setLayout(new FlowLayout());
        for (int i = 0; i < 5; i++) {
            jpan.add(new JButton("Button" + i));
        }
        jfrm2.add(jpan);
        jfrm2.setVisible(true);

// Создать кнопки 5шт относительно сторон света
         JFrame jfrm3 = new JFrame("My Program");
        jfrm3.setSize(300, 200);
        jfrm3.setLocation(100, 200);
        jfrm3.setVisible(true);

        JPanel jpan2 = new JPanel();
        jpan2.setLayout(new BorderLayout());
        jpan2.add(new JButton("North"), BorderLayout.NORTH);
        jpan2.add(new JButton("South"), BorderLayout.SOUTH);
        jpan2.add(new JButton("West"), BorderLayout.WEST);
        jpan2.add(new JButton("East"), BorderLayout.EAST);
        jpan2.add(new JButton("Center"), BorderLayout.CENTER);
        jfrm3.add(jpan2);
        jfrm3.setVisible(true);


//Создать кнопки 5шт  в столбец
         JFrame jfrm4 = new JFrame("My Program");
        jfrm4.setSize(300, 200);
        jfrm4.setLocation(100, 200);
        jfrm4.setVisible(true);

        JPanel jpan3 = new JPanel();
        jpan3.setLayout(new BoxLayout(jpan3,BoxLayout.Y_AXIS));
        for (int i = 0; i < 5; i++){
            jpan3.add(new JButton("Button" + i));
        }
        jfrm4.add(jpan3);
        jfrm4.setVisible(true);

//Создать кнопки 12 шт в 3 столбеца по 4 кнопки
        JFrame jfrm5 = new JFrame("My Program");
        jfrm5.setSize(300, 200);
        jfrm5.setLocation(100, 200);
        jfrm5.setVisible(true);

        JPanel jpan4 = new JPanel();
        jpan4.setLayout(new GridLayout(4,3,10,10));
        for (int i = 0; i < 12; i++){
            jpan4.add(new JButton("Button" + i));
        }
        jfrm5.add(jpan4);
        jfrm5.setVisible(true);


//Создать кнопку с размером 180х50

        JFrame jfrm6 = new JFrame("My Program");
        jfrm6.setSize(300, 200);
        jfrm6.setLocation(100, 200);
        jfrm6.setVisible(true);

        JPanel jpan5 = new JPanel();
        JButton btn1 =  new JButton ("Size 180x50");
        btn1.setPreferredSize(new Dimension(180,50));
        jpan5.add(btn1);
        jfrm6.add(jpan5);
        jfrm6.setVisible(true);
    }
}
