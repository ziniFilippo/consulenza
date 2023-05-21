package it.itispaleocapa.zinif;

public class Funzionario extends Personale {
    public static final int COSTO_ORARIO_JUNIOR = 70;
    public static final int COSTO_ORARIO_SENIOR = 80;

    public Funzionario(int codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }

    @Override
    public double getCostoOrario() {
        if (annoAssunzione < 10) {
            return COSTO_ORARIO_JUNIOR;
        } else {
            return COSTO_ORARIO_SENIOR;
        }
    } 
}