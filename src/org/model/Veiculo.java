package org.model;

import java.util.Date;

public class Veiculo {
    private long id;
    private Enum Status;
    private int km;
    private String placa;
    private String chassi;
    private String renavam;
    private String cor;
    private Modelo modelo;

    public Veiculo (){
        this.id = 0;
        this.Status = "";
        this.chassi = "";
        this.renavam = "";
        this.cor = "";
        this.modelo = "";
    }


}
