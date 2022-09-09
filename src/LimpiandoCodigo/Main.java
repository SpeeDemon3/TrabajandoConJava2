package LimpiandoCodigo;

public class Main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter bombillaInglesa = new PowerAdapter();

        enciende(horno);
        enciende(lampara);
        enciende(bombillaInglesa);
        apaga(horno);

    }
    public static void enciende(Enchufable enchufable) {
        enchufable.enciende();
    }

    public static void apaga(Enchufable enchufable) {
        enchufable.apaga();
    }

}
