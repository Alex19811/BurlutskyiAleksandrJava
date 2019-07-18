package LabWork271_273;

public class Device {


    String manufacturer;
    float price;
    String serialNumber;
    private Device device;
    private Device device1;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {

        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {

        this.serialNumber = serialNumber;
    }

    public String toString() {
        System.out.println("Device" + ": "
                + "manufacturer=" + getManufacturer() + ", "
                + "price=" + getPrice() + ", "
                + "serialNumber=" + getSerialNumber());
        return (getSerialNumber() + getPrice() + getSerialNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device2 = (Device) o;

        if (Float.compare(device2.price, price) != 0) return false;
        if (manufacturer != null ? !manufacturer.equals(device2.manufacturer) : device2.manufacturer != null)
            return false;
        if (serialNumber != null ? !serialNumber.equals(device2.serialNumber) : device2.serialNumber != null)
            return false;
        if (device != null ? !device.equals(device2.device) : device2.device != null) return false;
        return device1 != null ? device1.equals(device2.device1) : device2.device1 == null;

    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + (device != null ? device.hashCode() : 0);
        result = 31 * result + (device1 != null ? device1.hashCode() : 0);
        return result;
    }
}




