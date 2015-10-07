/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgabriellima.viridis.entity;

import java.util.Date;
import java.util.Objects;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 *
 * @author stark
 */
@Table("Medidor")
public class Medidor {

    @PrimaryKey
    private Date id;

    private Integer valor;

    private String medidor;

    public Medidor() {
    }

    public Date getId() {
        return id;
    }

    public void setId(Date id) {
        this.id = id;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getMedidor() {
        return medidor;
    }

    public void setMedidor(String medidor) {
        this.medidor = medidor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.valor);
        hash = 23 * hash + Objects.hashCode(this.medidor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medidor other = (Medidor) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        if (!Objects.equals(this.medidor, other.medidor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medidor{" + "id=" + id + ", valor=" + valor + ", medidor=" + medidor + '}';
    }

}
