package com.github.lessalc.cities.taxes;

import javax.persistence.*;

@Entity(name = "Tax")
@Table(name = "icms")
public class Tax {

    @Id
    private Long id;

//    @OneToOne
//    @JoinColumn(name = "estado", referencedColumnName = "id")
    // Algum erro, não identificando a tabela (entidade) estado. A corrigir.
    private Long uf;

    @Column(name = "taxa")
    private Double tax;

    public Tax() {
    }

    public Long getId() {
        return id;
    }

    public Long getUf() {
        return uf;
    }

    public Double getTax() {
        return tax;
    }
}
