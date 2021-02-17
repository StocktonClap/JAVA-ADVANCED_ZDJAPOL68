package homework.task3;

abstract public class ElectronicDevices {
    private final String producer;
    private final int batteryCapacity;
    boolean isWifi;

    protected ElectronicDevices(String producer, int batteryCapacity) {
        this.producer = producer;
        this.batteryCapacity = batteryCapacity;
    }

    public boolean isWifi() {
        return isWifi;
    }

    public void setWifi(boolean wifi) {
        isWifi = wifi;
    }

    public String getProducer() {
        return producer;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    abstract public String sendSMS(String sms);

    public int maxWorkTime(int consumptionPerHour) {
        return batteryCapacity / consumptionPerHour;
    }
}
