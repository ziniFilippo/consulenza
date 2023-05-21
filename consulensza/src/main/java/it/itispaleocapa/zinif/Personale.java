package it.itispaleocapa.zinif;

public abstract class Personale {
    private int codice;
    private String cognome;
    private String nome;
    public int annoAssunzione;

    public Personale(int codice, String cognome, String nome, int annoAssunzione) {
        this.codice = codice;
        this.cognome = cognome;
        this.nome = nome;
        this.annoAssunzione = annoAssunzione;
    }

    public abstract double getCostoOrario();
}