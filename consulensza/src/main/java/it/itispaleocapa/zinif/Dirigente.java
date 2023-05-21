package it.itispaleocapa.zinif;


public class Dirigente extends Personale {
    public static final int COSTO_ORARIO = 100;

    public Dirigente(int codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }

    @Override
    public double getCostoOrario() {
        return COSTO_ORARIO;
    }
}
