package com.example.demo.Osoby;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class OsobaService {

    private Map<String, Osoba> repo = new HashMap<>();
    private String generatePesel() {
        LocalDateTime now = LocalDateTime.now();
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(now.getYear())
                .append(String.format("%02d",  now.getMonthValue()))
                .append(String.format("%02d",  now.getDayOfMonth()))
                .append(new Random().nextInt(10000,99999))
                .toString();
    }

    public Osoba create(Osoba newOsoba) {
        newOsoba.setPesel(generatePesel());
        repo.put(newOsoba.getPesel(), newOsoba);
        return newOsoba;
    }

    public List<Osoba> list() {
        return repo.values().stream().toList();
    }

    public Osoba get(String pesel) {
        return repo.get(pesel);
    }

    public Osoba update (Osoba toUpdate) {
        if(repo.containsKey(toUpdate.getPesel())) {
            return repo.put( toUpdate.getPesel() ,toUpdate);
        }
        return null;
    }

    public void delete(String pesel) {
        repo.remove(pesel);
    }
}
