package it.itispaleocapa.zinif;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgettoTest {
    @Test
    public void testCostoComplessivo() {
        Progetto progetto = new Progetto();

        // Aggiungi membri del personale al progetto
        TecnicoInformatico tecnicoInformatico = new TecnicoInformatico(1, "Rossi", "Mario", 2010, true);
        TecnicoElettronico tecnicoElettronico = new TecnicoElettronico(2, "Bianchi", "Luigi", 2015, false);
        Funzionario funzionarioJunior = new Funzionario(3, "Verdi", "Paolo", 2018);
        Funzionario funzionarioSenior = new Funzionario(4, "Gialli", "Laura", 2005);
        Dirigente dirigente = new Dirigente(5, "Neri", "Giuseppe", 2000);

        progetto.aggiungiMembroPersonale(tecnicoInformatico);
        progetto.aggiungiMembroPersonale(tecnicoElettronico);
        progetto.aggiungiMembroPersonale(funzionarioJunior);
        progetto.aggiungiMembroPersonale(funzionarioSenior);
        progetto.aggiungiMembroPersonale(dirigente);

        // Calcola il costo complessivo
        double costoComplessivo = progetto.getCostoComplessivo();

        // Verifica il risultato atteso
        double costoAtteso = tecnicoInformatico.getCostoOrario() + tecnicoElettronico.getCostoOrario()
                + funzionarioJunior.getCostoOrario() + funzionarioSenior.getCostoOrario()
                + dirigente.getCostoOrario();

        Assertions.assertEquals(costoAtteso, costoComplessivo);
    }
}
