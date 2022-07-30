public class Device extends Product {

    private String usbPort;

    public Device(int id, Brand brand, String serialNumber) {
        super(id, brand, serialNumber);
    }

    public String getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(String usbPort) {
        this.usbPort = usbPort;
    }
}
