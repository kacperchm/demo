package com.example.demo.Zadanie;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class ProfilService {
    private Map<Integer, Profil> repoProfil = new HashMap<>();

    public Profil create(Profil newProfil) {
        Integer id = newId();
        newProfil.setId(id);
        repoProfil.put(id ,newProfil);
        return newProfil;
    }

    public List<Profil> get() {
        return repoProfil.values().stream().toList();
    }

    public Profil getProfil(Integer id) {
        return repoProfil.get(id);
    }

    public Profil updateProfil(Profil profilToUpdate) {
        if(repoProfil.containsKey(profilToUpdate.getId())) {
            return repoProfil.put(profilToUpdate.getId(), profilToUpdate);
        }
        return null;
    }

    public void deleteProfil(Integer id) {
        repoProfil.remove(id);
    }

    private int newId() {
        return new Random().nextInt();
    }
}
