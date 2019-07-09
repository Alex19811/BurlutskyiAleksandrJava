package LabWork230;

    public class MyWindow {
        double width;
        double height;
        int numberOfGlass;
        String color;
        boolean isOpen;


        public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
            this.width = width;
            this.height = height;
            this.numberOfGlass = numberOfGlass;
            this.color = color;
            this.isOpen = isOpen;
        }


        public void printFilds() {
            System.out.println("My window: width - " + width + ", "
                    + " height - " + height + ", "
                    + " numberOfGlass - " + numberOfGlass + " ,"
                    + " color - " + color + ", "
                    + "isOpen - " + isOpen);
        }


        public MyWindow(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public MyWindow(double width, double height, int numberOfGlass) {
            this.width = width;
            this.height = height;
            this.numberOfGlass = numberOfGlass;
        }

        public void setWidth(double width) {

            this.width = width;
        }

        public void setHeight(double height) {

            this.height = height;
        }

        public void setNumberOfGlass(int numberOfGlass) {

            this.numberOfGlass = numberOfGlass;
        }
    }

