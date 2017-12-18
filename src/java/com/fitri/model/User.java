package com.fitri.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ONLINEUSER")
public class User implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String namadepan;
    private String namabelakang;
    private String username;
    private String password;
    private String tempatlahir;
    private String email;
    private String alamat;

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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fitri.model.User[ id=" + id + " ]";
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
     * @return the namadepan
     */
    public String getNamadepan() {
        return namadepan;
    }

    /**
     * @param namadepan the namadepan to set
     */
    public void setNamadepan(String namadepan) {
        this.namadepan = namadepan;
    }

    /**
     * @return the namabelakang
     */
    public String getNamabelakang() {
        return namabelakang;
    }

    /**
     * @param namabelakang the namabelakang to set
     */
    public void setNamabelakang(String namabelakang) {
        this.namabelakang = namabelakang;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the tempatlahir
     */
    public String getTempatlahir() {
        return tempatlahir;
    }

    /**
     * @param tempatlahir the tempatlahir to set
     */
    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
