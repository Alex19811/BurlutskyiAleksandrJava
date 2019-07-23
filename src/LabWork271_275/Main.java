package LabWork271_275;

public class Main {

    public static void main(String[] args) {
        Device device = new Device ("Samsung", (float) 120,"AB1234567CD");
        Device device1 = new Device ("Samsung", (float) 120,"AB1234567CD");
       // EthernetAdapter ethernetAdapter = new EthernetAdapter("Asus", (float) 10,"12000000345");
        Monitor monitor = new Monitor("Sassung", (float) 120,"AB1234567CD",1280,1024);


        device.toString();
        monitor.toString();

       //device.equals(Object o);

        device.hashCode();
        device1.hashCode();
        monitor.hashCode();

System.out.println(device.hashCode());
System.out.println(monitor.hashCode());


System.out.println(device.equals(device1));
    }
}
