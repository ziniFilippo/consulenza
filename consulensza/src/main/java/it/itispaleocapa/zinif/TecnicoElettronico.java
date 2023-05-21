package it.itispaleocapa.zinif;

public class TecnicoElettronico extends Tecnico {
    public static final int COSTO_ORARIO_ELETTRONICA = 50;

    public TecnicoElettronico(int codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }

    public TecnicoElettronico(int i, String string, String string2, int j, boolean b) {
        super(i, string, string2, i);
    }

    @Override
    public double getCostoOrario() {
        return super.getCostoOrario() + COSTO_ORARIO_ELETTRONICA;
    }
}
