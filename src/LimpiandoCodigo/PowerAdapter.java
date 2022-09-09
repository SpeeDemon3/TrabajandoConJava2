package LimpiandoCodigo;

public class PowerAdapter implements Enchufable {
    public BombillaInglesa bombillaInglesa = new BombillaInglesa();

    public void enciende() {
        bombillaInglesa.turnOn(110);
    }

    public void apaga() {
        bombillaInglesa.turnOn(0);
    }

    public boolean estaEncendido() {
        return bombillaInglesa.isPoweredOn();
    }

}
