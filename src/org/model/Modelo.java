package org.model;

import java.util.Date;

public class Modelo {
    private long id;
    private String nome;
    private Date anoModelo;
    private int qtModelo;

    public Modelo(){
        this.id = 0;
        this.nome = "";
        this.anoModelo = new Date();
    }

    public Modelo(long id, String nome,Date anoModelo, int qtModelo){
        this.id = id;
        this.nome = nome;
        this.anoModelo = anoModelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQtModelo() {
        return qtModelo;
    }

    public void setQtModelo(int qtModelo) {
        this.qtModelo = qtModelo;
    }
}
