package LimpiandoCodigo;

public class BombillaInglesa {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;
        System.out.println("BombillaInglesa encendida con " + voltage + " of current, state: " + isPoweredOn());
    }

    public void turnOff() {
        poweredOn = false;
        voltage = 0;
        System.out.println("BombillaInglesa apagada");
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }


}
