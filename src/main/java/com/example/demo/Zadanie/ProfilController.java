package com.example.demo.Zadanie;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/profile")
public class ProfilController {

    private ProfilService profilService;

    public ProfilController(ProfilService profilService) {
        this.profilService = profilService;
    }

    @GetMapping
    public List<Profil> getProfiles() {
        return profilService.get();
    }

    @GetMapping("/{id}")
    public Profil getProfil(@PathVariable int id) {
        return profilService.getProfil(id);
    }

    @PostMapping
    public Profil createProfile(@RequestBody Profil profil) {
        return profilService.create(profil);
    }

    @PutMapping
    public Profil updateProfile(@RequestBody Profil profil) {
        return profilService.updateProfil(profil);
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable int id) {
        profilService.deleteProfil(id);
    }
}
