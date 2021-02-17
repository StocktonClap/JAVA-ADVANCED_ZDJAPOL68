package homework.task3;

public class Laptop extends ElectronicDevices {
    final String dvdDrive;
    final int powerSupply;

    public Laptop(int batteryCapacity, String producer, int powerSupply, String dvdDrive) {
        super(producer, batteryCapacity);
        this.dvdDrive = dvdDrive;
        this.powerSupply = powerSupply;
    }

    public String getDvdDrive() {
        return dvdDrive;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public String sendSMS(String sms){
        if (isWifi){
            return "Your laptop is sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }
}
