package it.itispaleocapa.zinif;

import java.util.ArrayList;
import java.util.List;

public class Progetto {
    private List<Personale> membriPersonale;

    public Progetto() {
        membriPersonale = new ArrayList<>();
    }

    public void aggiungiMembroPersonale(Personale membro) {
        membriPersonale.add(membro);
    }

    public double getCostoComplessivo() {
        double costoComplessivo = 0;
        for (Personale membro : membriPersonale) {
            costoComplessivo += membro.getCostoOrario();
        }
        return costoComplessivo;
    }
}