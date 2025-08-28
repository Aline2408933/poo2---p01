package org.principal;

import org.model.Marca;
import org.model.Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
      public static void main(String[] args) {
          Modelo modelo1 = new Modelo(1,"Ford Ranger", new Date(), 10);
          Modelo modelo2 = new Modelo(2, "Focus", new Date(), 5);
          List<Modelo> modelos = new ArrayList<>();
          modelos.add(modelo1);
          modelos.add(modelo2);

          modelo1.setId(3);
          modelo1.setNome("Onix");
          modelo1.setAnoModelo(new Date());
          modelo1.setQtModelo(45);

          System.out.println(modelo1.getId());
          System.out.println(modelo1.getNome());
          System.out.println(modelo1.getAnoModelo());
          System.out.println(modelo1.getQtModelo());

      }
}
