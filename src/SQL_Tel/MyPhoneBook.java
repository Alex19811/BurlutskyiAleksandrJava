package SQL_Tel;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    private int i = 0;

    public void addPhoneNumber(String name, String phone) {
        if (i < 10) {
            phoneNumbers[i] = new PhoneNumber(name, phone);
            i++;
        } else {
            System.out.println("Превышен размер телефонной книги. Макс.к-во номеров = 10");
        }
    }

    public void sortByName() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }

    public void sortByPhoneNumber() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.phone.compareTo(o2.phone);
            }
        });
    }

//        if (i < 10 ) {
//            try {
//                throw new MyPhoneBookNullPointerException(i + 1);
//            } catch (NullPointerException ex) {
//
//            } catch (MyPhoneBookNullPointerException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("Превышен размер телефонной книги. Макс.к-во номеров = 10");
//        }


    public void printPhoneBook() {
        for (PhoneNumber phoneNumber : phoneNumbers) {
            try {
                System.out.println(phoneNumber.toString());
            } catch (NullPointerException ex) {
            }
        }
    }

    static class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }


//        Example of program output:
//        Name: Sasha, phone: 050123456
//        Name: Vova, phone: 067987654

        @Override
        public String toString() {
            return "Name: " + name + ", phone: " + phone;
        }

    }
}
