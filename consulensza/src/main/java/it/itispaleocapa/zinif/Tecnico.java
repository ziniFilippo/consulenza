package it.itispaleocapa.zinif;

public abstract class Tecnico extends Personale {
    public static final int COSTO_ORARIO_INTERNO = 40;
    public static final int COSTO_ORARIO_ESTERNO = 0;
    public static final int COSTO_ANNUO_INTERNO = 1;
    public boolean interno;

    public Tecnico(int codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }

    public boolean isInterno() {
        return interno;
    }

    @Override
    public double getCostoOrario() {
        double costoOrario = isInterno() ? COSTO_ORARIO_INTERNO : COSTO_ORARIO_ESTERNO;
        return costoOrario + COSTO_ANNUO_INTERNO * (2023 - annoAssunzione);
    }
}
