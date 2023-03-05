package com.example.demo.Zadanie;

import io.swagger.v3.oas.models.security.SecurityScheme;

import java.util.List;

public class Profil {
    private Integer id;
    private String nazwa;
    private List<String> zainteresowania;
    private boolean aktywny;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<String> getZainteresowania() {
        return zainteresowania;
    }

    public void setZainteresowania(List<String> zainteresowania) {
        this.zainteresowania = zainteresowania;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }
}
