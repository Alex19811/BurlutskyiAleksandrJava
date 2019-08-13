package LabWork2121;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {

    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    int anchor = 0;

    //3) Добавить в класс MyPhoneBook public метод  addPhoneNumber)
    // с двумя параметрами типа String (имя, телефон),
    // которые используют его для создания нового объекта PhoneNumber и передать его следующему
    //доступному элементу массива.

    public void addPhoneNumber(String name, String phone) {
        phoneNumbers[anchor] = new PhoneNumber(name, phone);
        anchor++;
    }

    public void printPhoneBook() {
        for (int i = 0; i < anchor; i++)
            System.out.println(phoneNumbers[i]);

    }


    //2.12.2
    //??? для сортировки массива PhoneNumbers по имени (используя интерфейс Comparator и анонимный класс).
    public void sortByName() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    //???для сортировки PhoneNumbers и телефона (используя интерфейс Comparator и анонимный класс).
    public void sortByPhoneNumber() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return  o1.getPhone().compareTo(o2.getPhone());
            }
        });


    }


    public static class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone =phone;
        }

        public String getName()
        {
            return name;
        }

        public String getPhone()
        {
            return phone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "phoneNumber{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
