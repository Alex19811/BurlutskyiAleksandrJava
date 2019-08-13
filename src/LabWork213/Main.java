package LabWork213;



public class Main {
    static Computer[] computers = new Computer[5];

    public static void main(String args[]) {

                computers[0] = new Computer("A");
                computers[1] = new Computer("B");
                computers[2] = new Computer("C");
                computers[3] = new Computer("D");
                computers[4] = new Computer("E");

                for (int i = 0; i<5; i++){
                    System.out.println(computers[i].name);
                }

        for (int i = 0; i<computers.length; i++);

        System.out.print("Please input name of computer");

        Computer computer1 = new Computer("A");
        Computer computer2 = new Computer("B");
        Computer computer3 = new Computer("C");
        Computer computer4 = new Computer("D");
        Computer computer5 = new Computer("E");

    }
}

//        class Cat{
//            String name;
//
//            public Cat (String name){
//                this.name = name;
//            }
//        }
///
//
//        Computer[] name = new Computer[] {1,2,3,4,5}
//        //{"HP", "SAMSUNG","ASUS","LENOWO","Mac"};
//
//        for (int i = 0; i<5; i++);
//        System.out.print("Please input manufacturer of computer");
//
//
//
//        Scanner array   = new Scanner(System.in);
//        Computer computer = new Computer();
//        computer.setManufacturer("HP");
//        System.out.println();
//        for (int i = 0; i<computer.length; i++);
//        System.out.print("Please input manufacturer of computer");
//        computer.setManufacturer(Scanner.nextLine());
//        System.out.print("");
//        computer.setSerialNumber integer; parsent(Scanner.nextLine());
//       /Computer[i] = computer;
//       for (Computer computer : computers) {
//
//        }
//    }
//
//    //System.out.println(computer.toString ("Computers input"))
//
//
