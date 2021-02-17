package homework.task3;

public class SmartWatch extends ElectronicDevices {
    final String strapColor;

    public SmartWatch(String producer, int batteryCapacity, String strapColor) {
        super(producer, batteryCapacity);
        this.strapColor = strapColor;
    }

    public String getStrapColor() {
        return strapColor;
    }

    public String sendSMS(String sms){
        if (isWifi){
            return "Your smartwatch is Sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }
}
