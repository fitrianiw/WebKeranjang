/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fitri.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table (name = "PRODUCTNAME")
public class Productt implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String namaBrand;
    private String description;
    private String gambar;
    private String harga;

    public Productt() {
    }

    public Productt(int id, String namaBrand, String description, String gambar, String harga) {
        this.id = id;
        this.namaBrand = namaBrand;
        this.description = description;
        this.gambar = gambar;
        this.harga = harga;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productt)) {
            return false;
        }
        Productt other = (Productt) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fitri.model.Productt[ id=" + id + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the namaBrand
     */
    public String getNamaBrand() {
        return namaBrand;
    }

    /**
     * @param namaBrand the namaBrand to set
     */
    public void setNamaBrand(String namaBrand) {
        this.namaBrand = namaBrand;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the gambar
     */
    public String getGambar() {
        return gambar;
    }

    /**
     * @param gambar the gambar to set
     */
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    /**
     * @return the harga
     */
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(String harga) {
        this.harga = harga;
    }
    
}
