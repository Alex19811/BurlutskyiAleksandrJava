package LabWork2121;

public class MyPhoneBook {

    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public PhoneNumber addPhoneNumber() {
       // phoneNumbers[0] = new phoneNumber("ddd", "ddd");
//        phoneNumbers[1] = new phoneNumber();
//        phoneNumbers[2] = new phoneNumber();
//        phoneNumbers[3] = new phoneNumber();
//        phoneNumbers[4] = new phoneNumber();
//        phoneNumbers[5] = new phoneNumber();
//        phoneNumbers[6] = new phoneNumber();
//        phoneNumbers[7] = new phoneNumber();
//        phoneNumbers[8] = new phoneNumber();
//        phoneNumbers[9] = new phoneNumber();


        for (int i = 0; i < phoneNumbers.length; ++i) {
            phoneNumbers[i] = addPhoneNumber();
            System.out.print(phoneNumbers[i] + "  ");
        }

        return new PhoneNumber();
    }

    public String printPhoneBook() {
        for (int i = 0; i < phoneNumbers.length; i++)
            System.out.println(phoneNumbers[i].toString());
        return new String();
    }

    public static class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber() {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "phoneNumber{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }


    private class phoneNumber extends PhoneNumber {
        public phoneNumber(String ddd, String ddd1) {
            super();
        }
    }
}
