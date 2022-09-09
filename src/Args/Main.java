package Args;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Seat";
        coche.modelo = "Leon";
        coche.puertas = 5;

        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);

        Coche clonado = coche.clonar();
        clonado.marca = "Cupra";
        System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);

        OptionsParse optionsParse = new OptionsParse(args);
        optionsParse.addOption("coche");
        optionsParse.addOption("clonado");
        optionsParse.parse();


        String valCoche = optionsParse.getOption("coche");
        String valClonado = optionsParse.getOption("clonado");
        System.out.println("valCoche es: " + valCoche);
        System.out.println("valCoche es: " + valClonado);


    }
}
