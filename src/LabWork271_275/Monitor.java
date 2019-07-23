package LabWork271_275;

public class Monitor extends Device {
    int resolutionX;
    int resolutionY;


    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionX(int resolutionX) {

        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {

        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        System.out.println("Monitor" + ": "
                + "manufacturer=" + getManufacturer() + ", "
                + "price=" + getPrice() + ", "
                + "serialNumber=" + getSerialNumber() + ", "
                + "X=" + getResolutionX() + ", "
                + "Y=" + getResolutionY());
        return (getManufacturer() + getPrice() + getSerialNumber() + getResolutionX() + getResolutionY());
    }

}

