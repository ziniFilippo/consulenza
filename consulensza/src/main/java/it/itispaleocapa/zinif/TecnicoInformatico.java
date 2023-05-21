package it.itispaleocapa.zinif;

public class TecnicoInformatico extends Tecnico {
    public static final int COSTO_ORARIO_INFORMATICA = 40;

    public TecnicoInformatico(int codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }

    public TecnicoInformatico(int i, String string, String string2, int j, boolean b) {
        super(i, string, string2, i);
    }

    @Override
    public double getCostoOrario() {
        return super.getCostoOrario() + COSTO_ORARIO_INFORMATICA;
    }

    public static int getCostoOrarioInformatica() {
        return COSTO_ORARIO_INFORMATICA;
    }
}